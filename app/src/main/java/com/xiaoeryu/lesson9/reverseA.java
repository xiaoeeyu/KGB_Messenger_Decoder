package com.xiaoeryu.lesson9;

public class reverseA {
    public static String decode_P(){
        String p = "V@]EAASB\u0012WZF\u0012e,a$7(&am2(3.\u0003";
        String result = a(p);
        return result;
    }
    private static String a(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char c = charArray[i];
            charArray[i] = (char) (charArray[(charArray.length - i) - 1] ^ 'A');
            charArray[(charArray.length - i) - 1] = (char) (c ^ '2');
        }
        return new String(charArray);
    }

    public static String r_to_hex(){
        String r = "\u0000dslp}oQ\u0000 dks$|M\u0000h +AYQg\u0000P*!M$gQ\u0000";
        byte[] bytes = r.getBytes();
        String result = "";
        for (int i = 0; i < bytes.length; i++) {
            result += String.format("%02X", bytes[i]);
        }
        return result;
    }
}
