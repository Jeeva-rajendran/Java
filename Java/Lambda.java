@FunctionalInterface
interface ABC{
    // void show();
    int add(int a, int b);
}


public class Lambda {
    public static void main(String[] args) {
        ABC obj = (a, b) -> a + b;
        System.out.println(obj.add(5,6));
    }
}
