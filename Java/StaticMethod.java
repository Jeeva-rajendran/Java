class Mobile{
    String brand;
    int price;
    static String name;     // It's like python class variable same for all object.
    
    public void show(){
        System.out.println(brand + " : " + price +  " : " + name);
    }
    public static void show1(Mobile obj){
        System.out.println("In static method");
        System.out.println(obj.brand);  // Using object reference we can indirectly access instance variable inside static method.
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smartphone";

        // Mobile.show() // Cannot make a static reference to the non-static method show() from the type Mobile

        Mobile.show1(obj1);
    }
}
