public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 2;
        double j = 0d;
        int arr[] = new int[5];

        try{
            j = 18/i;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
           System.out.println("Cannot divide by Zero"); 
        }
        catch(IndexOutOfBoundsException a){
            System.out.println("Index Out of Range");
        }
        catch(Exception e){     // Parent Class
            System.out.println("Something went Wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
         
    }
}
