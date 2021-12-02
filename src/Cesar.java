public class Cesar {

    //Alphabet
    static char[] a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,:;!\"§$%&/()=? ".toCharArray();

    //Encrypts the message
    public static String encrypt(String input, int key){

        char[] c = input.toCharArray();
        char[] r = new char[c.length];

        for(int i = 0; i<c.length; i++){
            int tmp = getCharIndex(c[i]);
            r[i] = a[Math.abs(((tmp+key)%a.length))];
        }
        return charArrayToString(r);
    }

    //gets the index of a given char in the alphabet string (Cesar.a)
    public static int getCharIndex(char x){
        for(int i = 0; i<a.length; i++){
            if(a[i] == x) return i;
        }
        return 0;
    }

    //converts a char array to a String
    public static String charArrayToString(char[] c){
        StringBuilder stringBuilder = new StringBuilder();
        for(char i : c){
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

}
