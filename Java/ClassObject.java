class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int multiply(int a, int b)
    {
        return a * b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public double divide(int a, int b){
        if (b != 0){
            return a / b;
        }
        else {
            System.out.println("Cannot divide with zero");
            return 0;
        }
    }
}



public class ClassObject {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.add(10, 20);
        int result2 = calc.multiply(10, 20);
        int result3 = calc.subtract(10, 20);
        double result4 = calc.divide(100, 20);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
