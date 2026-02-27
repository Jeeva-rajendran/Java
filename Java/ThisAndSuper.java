class A{

    A(){
        super();
        System.out.println("In A");
    }
    A(int a){
        super();
        System.out.println("In A int");
    }

}

class B extends A{
    B(){
        super(10);      // From here to A int constructor.
        System.out.println("In B");
    }
    B(int b){
        super();   // From here to A default parameter Constructor.
        System.out.println("In B int");
    }
}

class X{

    X(){
        super();
        System.out.println("In X");
    }
    X(int x){
        super();
        System.out.println("In X int");
    }

}

class Y extends X{
    Y(){
        super();      // From here to A int constructor.
        System.out.println("In Y");
    }
    Y(int y){
        this();   // From here to A default parameter Constructor.
        System.out.println("In Y int");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);
        // System.out.println(obj.getClass().getName());
        System.out.println("This");
        Y obj1 = new Y(5);
        System.out.println(obj + " " + obj1);

    }
}
