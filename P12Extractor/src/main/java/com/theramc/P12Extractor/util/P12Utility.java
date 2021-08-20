package com.theramc.P12Extractor.util;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Enumeration;

@Component
public class P12Utility {

    private String fileName = "config/Dev-Push-Certificate.p12";

    public String loadP12File() {

        String response = "No Response";
        Key key = null;
        Certificate cert = null;

        try {

            KeyStore ks = KeyStore.getInstance("PKCS12", "SUN");
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());

            InputStream in = new FileInputStream(file);
            ks.load(in, "".toCharArray());

            Enumeration aliasEnum = ks.aliases();

            while (aliasEnum.hasMoreElements()) {
                String keyName = (String) aliasEnum.nextElement();
                key = ks.getKey(keyName, "".toCharArray());
                cert = ks.getCertificate(keyName);
            }

            KeyPair kp = new KeyPair(cert.getPublicKey(), (PrivateKey) key);

            response = generateOutputResponse(kp, cert);

        } catch (Exception e) {
            response = e.toString();
            e.printStackTrace();
        }
        return response;
    }

    private String generateOutputResponse(KeyPair kp, Certificate cert) {
        StringBuilder response = new StringBuilder();

        response.append("\n\n\n");
        response.append(" KeyPair Private Key : " + kp.getPrivate());
        response.append("\n\n\n");
        response.append(" KeyPair Public Key : " + kp.getPublic());
        response.append("\n\n\n");
        response.append("Cert Public key : " + cert.getPublicKey().toString());
        response.append("\n\n\n");

        return response.toString();

    }

}
