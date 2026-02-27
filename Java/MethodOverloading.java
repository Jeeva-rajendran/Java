class Calculator{
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public int add(int a, int b){
        return a + b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res1 = c.add(4, 5);
        int res2 = c.add(2,3,4);
        System.out.println(res1);
        System.out.println(res2);
    }
}
