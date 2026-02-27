class A{
    public void show1(){
        System.out.println("IN A");
    }
}

class B extends A{

    public void show2(){
        System.out.println("IN B");
    }
}


public class UpcastingDowncasting {
    public static void main(String[] args) {
        double d = 4.5;
        int a = (int) d;
        System.out.println(a);

        A obj = (A) new B();    // We can do without type casting also. and this is upcasting.
        // obj.show2()     // This object doesn't know show2() because it is a A type object.

        B obj1 = (B) obj;
        obj1.show2();   // Downcasting because obj is parent object and we are downcasting to child object.
    }
}
