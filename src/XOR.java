import static java.lang.Math.random;

public class XOR {

    public static char[] encrypt(char[] by, char[] key){
        char[] result = new char[by.length];

        for(int i = 0; i<by.length; i++){
            char b1 =  by[i];
            char b2 = key[i];
            //System.out.println("Append: " + b1 + " " + b2 + " --> " + (b1^b2));
            result[i] = (char) (b1^b2);
        }
        return result;
    }

    public static void printCharArray(char[] c){
        for(char i : c){
            System.out.print(i);
        }
        System.out.println();
    }

}
