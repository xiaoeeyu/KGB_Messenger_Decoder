package com.xiaoeryu.lesson9;

public class reverseB {
    public static String search() {
        String characterset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~ \t\n\r";
        char [] charactersetArray = characterset.toCharArray();
        String ciphertext = "\000dslp}oQ\000 dks$|M\000h +AYQg\000P*!M$gQ\000";
        char [] charArray = ciphertext.toCharArray();


        for (int i2 = 0; i2 < charArray.length / 2; i2++) {
            char c = charArray[i2];
            charArray[i2] = charArray[(charArray.length - i2) - 1];
            charArray[(charArray.length - i2) - 1] = c;
        }


        String plaintext="";
        for(int i = 0 ; i < charArray.length; i++)
        {
            for(int j = 0; j < charactersetArray.length ; j++ ){
                char c = charactersetArray[j];
                char result = (char)(char)((c >> (i % 8) )^ c);
                if(result == charArray[i]){
                    plaintext+=charactersetArray[j];
                    break;
                }
            }
        }
        //Log.i("ceshi", "plaintext="+plaintext);
        return plaintext;
    }
}
