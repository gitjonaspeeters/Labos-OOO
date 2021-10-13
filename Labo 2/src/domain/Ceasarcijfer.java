package domain;

import java.util.Locale;

public class Ceasarcijfer implements Strategy{
    private static final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j','k','l','m','n','o','p','q','r','s', 't','u','v','w','x','y','z'};

    public String codeer(String tekst){
        char[] t=tekst.toLowerCase().toCharArray();
        char[] out=new char[tekst.length()];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j <alphabet.length; j++) {
                if (t[i]==alphabet[j]){
                    if (j+3>26){
                        out[i]=alphabet[j+3-26];
                    }else {
                        out[i]=alphabet[j+3];
                    }
                    
                }
            }
            
        }
        return tekst;
    }

    public String decodeer(String tekst){
        char[] t=tekst.toLowerCase().toCharArray();
        char[] out=new char[tekst.length()];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j <alphabet.length; j++) {
                if (t[i]==alphabet[j]){
                    if (j-3<0){
                        out[i]=alphabet[j-3+26];
                    }else {
                        out[i]=alphabet[j-3];
                    }

                }
            }

        }
        return tekst;
    }
}
