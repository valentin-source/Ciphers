public class Test {
    public static void main(String[] args) {
        String s = "Hello World!";
        String k = "FritzlfrimpftJava";
        char[] c = XOR.encrypt(s.toCharArray(), k.toCharArray());
        System.out.println("String: " + s);
        System.out.println("Key: " + k);
        System.out.print("Encrypted: ");XOR.printCharArray(c);
        c = XOR.encrypt(c, k.toCharArray());
        System.out.print("Decrypted: ");XOR.printCharArray(c);
    }
}
