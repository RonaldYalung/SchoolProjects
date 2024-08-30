//Author: Ronald Yalung
//Date: 06/27/2024
// "Let's get together and hash it out." - Tony Stark

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashes {
    private String hashedName;

    public void makeHash(String hashName) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] byteArr = md.digest(hashName.getBytes(StandardCharsets.UTF_8));

        StringBuilder buildStr = new StringBuilder();

        for (byte b : byteArr) {
            buildStr.append(String.format("%02x", b));
        }
       hashedName = buildStr.toString();
    }

    public String getHashedStr() {
        return hashedName;
    }

}
