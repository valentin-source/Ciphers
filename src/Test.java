public class Test {
    public static void main(String[] args) {
       // testXOR("Hallo Du Da", "00100100100111111111010010000101000100000100000000111010110101010100010011");
       // testCesar("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!§$%&/()=? ", 1);
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

}
