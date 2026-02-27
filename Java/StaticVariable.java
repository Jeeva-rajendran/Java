class Mobile{
    String brand;
    int price;
    static String name;     // It's like python class variable same for all object.
    public void show(){
        System.out.println(brand + " : " + price +  " : " + name);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "Smartphone";

        // Mobile.name = "phone";
        

        // Mobile arr[] = new Mobile[2];
        // arr[0] = obj1;
        // arr[1] = obj2;

        // for (Mobile n : arr){
        //     System.out.println(n.brand + " : " + n.price + " : " + n.name );
        // }
        obj1.show();
        obj2.show();
    }
}
