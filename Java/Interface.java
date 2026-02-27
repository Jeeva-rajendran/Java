interface A{
    int age = 21;    // By default final and static
    String area = "Bangalore";

    void show();
    void config();

    default void abc(){
        System.out.println("Hello World");
    }
}
class B implements A{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
};
public class Interface {
    public static void main(String[] args) {
        A obj;
        obj = new B() ;
        obj.show();
        obj.config();

        obj.abc();
        
        System.out.println(A.age + " : " + A.area );
    }
}
