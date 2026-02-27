class A{
    int x = 10;
    public void show(){
        System.out.println("In A Show");
    }
}
class B extends A{
    int x = 20;
    public void show(){
        System.out.println("IN B Show");
    }

}
class C extends A{

}
public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();     // Method depends on Object type.
        System.out.println(obj.x);      // Variable depend on Reference type.
    }
}
