@FunctionalInterface
interface A{
    void show();
    // void run();  Error invalid Functional interface annotation
}

// class B implements A{
//     public void show(){
//         System.out.println("In show");
//     }
// }

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        // A obj = new B();
        // obj.show();

        // Without lambda
        // A obj1 = new A() {
        //     public void show(){
        //         System.out.println("In show");
        //     }
        // };

        A obj1 = () -> {
            System.out.println("In Show");
        };
        obj1.show();
    }
}
