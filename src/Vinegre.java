public class Vinegre {

    String in;
    String keyin;
    String key = "";

    Vinegre(String in, String keyin){
        this.in = in;
        this.keyin = keyin;
    }

    public static String encryptStatic(String in, String keyin){
        String key = "";
        while (key.length() < in.length()) key += keyin;
        return XOR.encrypt(in, key);
    }


    public String encrypt(){
        while (key.length() < in.length()) key += keyin;
        return XOR.encrypt(in, key);
    }

}
