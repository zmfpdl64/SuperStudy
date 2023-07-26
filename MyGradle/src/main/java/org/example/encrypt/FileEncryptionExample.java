package org.example.encrypt;

import org.jasypt.digest.StandardStringDigester;
import org.jasypt.encryption.pbe.PBEBigDecimalEncryptor;
import org.jasypt.encryption.pbe.StandardPBEBigDecimalEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.jasypt.salt.StringFixedSaltGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class FileEncryptionExample {
    public static void main(String[] args) throws IOException {
        String encryptedOutputFilePath = "D:\\LeeWooJin\\Programming\\super\\super_backend\\MyGradle\\src\\main\\java\\org\\example\\encrypt\\encrypted_abc.txt";
        String decryptedOutputFilePath = "org/example/encrypt/decrypted_abc.txt";

        final String PW = "12341234";
        final String ALGORITHM = "PBEWithMD5AndDES";
        final String SALT_GENERATOR = "someFixedSalt";

        String encryptString = readTextFile(encryptedOutputFilePath);

        // TODO: 위 정보를 이용해서 "encryptedOutputFilePath" 파일을 읽고 복호화 하영합니다.
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        config.setPassword(PW);
        config.setAlgorithm(ALGORITHM);
        config.setSaltGenerator(new StringFixedSaltGenerator(SALT_GENERATOR));
        encryptor.setConfig(config);

        String decryptString = encryptor.decrypt(encryptString);

        System.out.println("Decryption completed successfully.");
        System.out.println(decryptString);
    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}