import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance = 0;
        boolean running = true;
        while (running){
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdrawal\n4. Exit");
            System.out.print("Enter your choice: ");
            int user = sc.nextInt();
            switch (user) {
            case 1:
                System.out.println(Balance);
                break;
                
            case 2 :
                System.out.print("Enter amount you want to Deposit: ");
                int Deposit = sc.nextInt();
                if (Deposit > 0){
                    Balance += Deposit;
                    System.out.println("Successfully Deposit");
                }
                else System.out.println("Invalid Withdrawal Amount");
                break;
                
            case 3 : 
                System.out.print("Enter amount you want to Withdrawal: ");
                int WithDrawal = sc.nextInt();
                if (WithDrawal < 0 ){
                    System.out.println("Invalid Withdrawal Amount");
                }
                else if (Balance > WithDrawal){
                    Balance -= WithDrawal;
                    System.out.println("WithDraw Successfully");
                }
                else System.out.println("Insufficient Balance");
                break;
            default : 
                System.out.println("Thank you Visit again.");
                running = false;
                break;
            }
        }
        sc.close();
    }
}
