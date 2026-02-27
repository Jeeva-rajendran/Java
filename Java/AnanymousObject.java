class A{
    public A(){
        System.out.println("Object Created");
    }

    public void show(){
        System.out.println("Method from class A");
    }
}
public class AnanymousObject {
    public static void main(String[] args) {
        
        // A obj = new A();

        // obj.show();

        new A();       // Ananymous Object. -> An object without any name.

        new A().show();     // This is another object don't think both are same. -> using that we are accessing method .
    }
}
