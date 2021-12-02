public class Test {
    public static void main(String[] args) {
        testXOR("Hallo Du Da", "00100100100111111111010010000101000100000100000000111010110101010100010011");
    }



    public static void testXOR(String input, String key){
        System.out.println("String: " + input + "\nKey: " + key);

        char[] c = XOR.encrypt(input.toCharArray(), key.toCharArray());
        System.out.println("Encrypted: " + XOR.charArrayToString(c));
        c = XOR.encrypt(c, key.toCharArray());
        System.out.println("Decrypted: " + XOR.charArrayToString(c));
    }

}
