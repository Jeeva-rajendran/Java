class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

public class DuckingException {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();        // Full stack of methods which is calling which
            System.out.println("Not able to find the class");
        }
    }
}
