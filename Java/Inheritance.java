class Calc{
    public int add(int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }
}

class AdvCalc extends Calc{        // is a relationship.
    public int multi(int a, int b){
        return a * b;
    }

    public int divide(int a,int b){
        return a / b;
    }
}

class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2,4);
        int r2 = obj.sub(5,4);
        int r3 = obj.multi(2, 4);
        int r4 = obj.divide(4, 2);
        double r5 = obj.power(4, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
