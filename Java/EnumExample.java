enum Laptop{
    MacBook(2000), Asus(1900), Surface, ThinkPad(1800);

    private int price;

    private Laptop(){
        price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
public class EnumExample {
    public static void main(String[] args) {

        // Laptop lap = Laptop.MacBook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
        
    }
}
