class Example{
    int num;
    public void greet(){
        System.out.println("Hello world " + num);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.num = 10;
        obj.greet();
    }
}
