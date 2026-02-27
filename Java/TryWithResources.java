import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        double res = 0;
        try(Scanner sc = new Scanner(System.in)){       // If we gave inside the try no need of closing the scanner.

            System.out.print("Enter a Number: ");
            a = sc.nextInt();
            System.out.print("Enter a Number: ");
            b = sc.nextInt();   
            res = a/b;
        }
        // We can use try with finally that time catch is not need.
        // In this example what we mentioned in the parenthesis in try block is acting like an finally so catch block is optional.
        catch(ArithmeticException e){
            System.out.println("Something went Wrong");
        }
        System.out.println(res);
    }
}
