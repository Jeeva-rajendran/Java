class A{
    int a = 10;

    public void show(){
        System.out.println("In A show");
    }

    class B{
        public void config(){
            System.out.println("In Config");
        }
    }

    static class C{
        public void abc(){
            System.out.println("Static Inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C();       // We can use class name to call static class.
        obj2.abc();

    }
}
