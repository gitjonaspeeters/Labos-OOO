package domain;

public class Spiegelen implements Strategy {

    @Override
    public String codeer (String tekst){
        char[] input = tekst.toCharArray();
        char[] output= new char[tekst.length()];
        for (int i = 0; i < input.length; i++){
            output[input.length -i-1]= input[i];
        }
        return output.toString();
    }

    @Override
    public String decodeer(String tekst) {
        return codeer(tekst);
    }

}