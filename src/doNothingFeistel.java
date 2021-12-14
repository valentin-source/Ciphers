public class doNothingFeistel {

    private static String s = ""; //needs to be even!!!
    private static char[] c = s.toCharArray();
    private static int b;  //index of first char of second block

    private static char[] b1;
    private static char[] b2;

    //temporäre blöcke zum switchen
    private static char[] b3;

    public static String performFeistel(String Stringin){

        if(Stringin.length()%2 != 0) Stringin += " ";

        s = Stringin;
        c = s.toCharArray();

        b = c.length/2;
        b1  = new char[c.length/2];
        b2 = new char[c.length/2];
        b3 = new char[c.length/2];

        for(int i = 0; i<10; i++){
            FeistelLoop();
        }

        //Swapped from orig. implementation in loop
        //generate 1st block
        if (b >= 0) System.arraycopy(c, 0, b2, 0, b);
        //generate 2nd Block
        if (c.length - b >= 0) System.arraycopy(c, b, b1, 0, c.length - b);


        s = Cesar.charArrayToString(b1)+Cesar.charArrayToString(b2);
        c = s.toCharArray();

        return s;

    }

    private static void FeistelLoop(){

        //generate 1st Block
        if (b >= 0) System.arraycopy(c, 0, b1, 0, b);
        //generate 2nd Block
        if (c.length - b >= 0) System.arraycopy(c, b, b2, 0, c.length - b);

        //create cesar ciphertext from 2nd Block and store it in b3
        b3 = b1;
        b1 = b2;//Cesar.encrypt(Cesar.charArrayToString(b2), key).toCharArray();
        b2 = XOR.encrypt(b3, doNothing.encrypt(Cesar.charArrayToString(b2)).toCharArray()); //check if correct

        s = Cesar.charArrayToString(b1)+Cesar.charArrayToString(b2);
        c = s.toCharArray();
    }




}
