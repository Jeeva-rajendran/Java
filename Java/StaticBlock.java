class Mobile{
    String brand;
    int price;
    static String name;     // It's like python class variable same for all object.

    static{
        name = "Phone";     // This block will be called only one time.
        System.out.println("In static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In Constructor");
    }
    
    public void show(){
        System.out.println(brand + " : " + price +  " : " + name);
    }

}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "Smartphone";

        // Mobile obj2 = new Mobile();

        Class.forName("Mobile");
    }
}
