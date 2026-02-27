class MyException extends Exception{
    public MyException(){
    }

    public MyException(String s){
        super(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        String name = "John";
        try{
            if (name != "Jeeva"){
                throw new MyException("Hello Buddy How are you");
            }
        }
        catch(MyException a){
            System.out.println(a);
        }
        System.out.println("Thank you");
    }
}
