package kg.salongo.SalonGoBack.utils;

import java.util.Random;

public class RandomUtils {
    public static final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public static String createToken(){
        return randomString(80);
    }

    public static String randomString(int length) {
        Random random = new Random();
        String randomString = "";
        for (int i = 0; i < length; i++) {
            randomString += chars.charAt(random.nextInt(chars.length()));
        }
        return randomString;
    }
}
