public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(num);    // Boxing
        Integer num1 = num;     // AutoBoxing.
        System.out.println(num1);

        int num2 = num1.intValue();     // unboxing.
        System.out.println(num2);

        int num3 = num1;     // auto - unboxing.
        System.out.println(num3);

        String str = "12";
        int a = Integer.parseInt(str);    // To get the integer value which is present in a string format.
        System.out.println(a * a);

    }
}
