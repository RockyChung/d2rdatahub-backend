package com.rocky.d2rdatahub.enc;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EncryptionCodeTest {

    @Test
    public void testEncryption() {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        // Set the password used for encryption (this should match jasypt.encryptor.password)
        encryptor.setPassword("******");
        encryptor.setAlgorithm("PBEWithMD5AndDES");

        String target = "****************";
        String encrypted = encryptor.encrypt(target);
        String decrypted = encryptor.decrypt(encrypted);

        System.out.println("Original: " + target);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);

        Assertions.assertEquals(target, decrypted);
    }


}
