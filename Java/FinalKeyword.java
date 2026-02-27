class Calc{
    final public void show(){
        System.out.println("By Jeeva");
    }
    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc{
    // public void show(){     // We can't create a method show()
    //     System.out.println("By John");
    // }
}

final class A{

}

// class B extends A{   // We stop inherting A class with final keyword.

// }

public class FinalKeyword {
    public static void main(String[] args) {
        final int a = 10;
        // a = 20;
        System.out.println(a);
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(3, 4);

    }
}
