public class TypeConversion {
    public static void main(String[] args) {
        byte a = 127;
        int b = 16;
        a = (byte) b;  // Type Casting.
        // a = b;  error: incompatible types: possible lossy conversion from int to byte
        double d = 5.6;

        int num1 = 12;
        byte k = (byte) num1;
        System.out.println(k);
        System.out.println((int) d);
        System.out.println(a + " " + b);
    }
}
