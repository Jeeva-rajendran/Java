public class MultidimensionalArray {
    public static void main(String[] args) {
        int nums [][] = new int[3][4];
        // nums[0][0] = 1;
        // nums[0][1] = 2;
        // nums[1][0] = 3;
        // nums[1][1] = 4;

        // Adding Random values.
        // For generator two digit number we have to multiply with 100.
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 10); // We have to type cast after calculation that' why i used parenthesis.
            }
        }

        // Fetching the value.
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        // Enhanced for loop to fetch the values of array.

        for (int n[] : nums){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
    }
}
