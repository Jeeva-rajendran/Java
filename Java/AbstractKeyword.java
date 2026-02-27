abstract class Car{
    public abstract void drive();

    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }

    public void fly(){
        System.out.println("Flying");
    }
}


public class AbstractKeyword {
    public static void main(String[] args) {
        // Car obj = new Car();    This is not possible we can't create a object for abstract class.

        Car obj = new WagonR();     // We can create a reference of of abstract class.
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
