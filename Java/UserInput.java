// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) throws Exception {
        /* int num = 0;
        try{
            num = System.in.read();     // It will read only one character.
        }
        catch (Exception a){
            System.out.println(a);
        }
        System.out.println(num - 48);
        */


        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        // int num1 = Integer.parseInt(bf.readLine());
        // System.out.println(num1);

        int num2 = sc.nextInt();
        System.out.println(num2);

        // bf.close();
        sc.close();
    }
}
