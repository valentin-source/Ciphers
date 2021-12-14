public class Test {
    public static void main(String[] args) {
        // testXOR("Hallo Du Da", "00100100100111111111010010000101000100000100000000111010110101010100010011");
         //testFeistel("Ich höre bei VWL nicht zu", 1000000);

        //System.out.println( doNothingFeistel.performFeistel("Hallo du da Valle"));

        Vinegre v = new Vinegre("Hallo du da", "1029418310291802931");
        System.out.println(v.encrypt());
        v.in = v.encrypt();
        System.out.println(v.encrypt());

        /*String tmp = "pruefung";
        for(int i = 0; i<13; i++){
            tmp = Cesar.encrypt(tmp, 2);
            System.out.println(tmp);
        }
        System.out.println("Result: " + tmp);*/
    }

    public static void testXOR(String input, String key){
        System.out.println("String: " + input + "\nKey: " + key);

        String c = XOR.encrypt(input, key);
        System.out.println("Encrypted: " + c);
        c = XOR.encrypt(c, key);
        System.out.println("Decrypted: " + c);
    }

    public static void testCesar(String input, int key){

        String tmp = Cesar.encrypt(input, key);
        System.out.println(tmp);
        tmp = Cesar.encrypt(tmp, Cesar.a.length-key);
        System.out.println(tmp);


    }

    public static void testFeistel(String s, int k){

        System.out.println();

        System.out.println("String: " + s);
        System.out.println("Key: " + k);

        System.out.println("\nEncrypted: ");
        String tmp = CesarFeistel.performFeistel(s,k);
        System.out.print("");

        System.out.println(tmp);
        System.out.println("\nDecrypted: ");
        tmp = CesarFeistel.performFeistel(tmp, k);
        System.out.println(tmp);

    }
}
