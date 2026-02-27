// abstract class Computer{       // Instead of using abstract class we can use interface here.
//     // public void code(){     // We are not doing anything here, so instead of defining we can declare it.

//     // }

//     public abstract void code();
// }

interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run : Faster");
    }
}

class Developer{
    public void devApp(Computer lap){   
        lap.code();     // object of desktop but reference of computer. -> Method will be called based on what object we are passing.
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {

        Computer lap = new Laptop();

        Computer desk = new Desktop();

        Developer jeeva = new Developer();
        System.out.println(desk);
        jeeva.devApp(lap);

    }
}
