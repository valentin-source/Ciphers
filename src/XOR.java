import static java.lang.Math.random;

public class XOR {

    //XORs every char with a char of the key (byte XOR byte)
    public static char[] encrypt(char[] by, char[] key){
        char[] result = new char[by.length];
        for(int i = 0; i<by.length; i++){
            result[i] = (char) (by[i]^key[i]);
        }
        return result;
    }

    //XORs every char with a char of the key (byte XOR byte)
    public static String encrypt(String b, String k){
        char[] by = b.toCharArray();
        char[] key = k.toCharArray();
        char[] result = new char[by.length];
        for(int i = 0; i<by.length; i++){
            result[i] = (char) (by[i]^key[i]);
        }
        return charArrayToString(result);
    }



    //Just a simple helper function to print the char arrays
    public static void printCharArray(char[] c){
        for(char i : c){
            System.out.print(i);
        }
        System.out.println();
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
