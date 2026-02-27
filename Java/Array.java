import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = {3,4,6,7};
        // num[1] = 10;
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        int nums[] = new int[4];
        for (int i=0;i<nums.length;i++){
            System.out.print("Enter the value: ");
            nums[i] = sc.nextInt();
        }
        sc.close();
    }
}
