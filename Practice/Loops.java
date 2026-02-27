class LoopsPractice {

    public void SumOfN(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public void fibonacci(int n){
        int a = 0;
        int b = 1;
        for (int i = 1; i<= n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    
}
public class Loops {
    public static void main(String[] args) {
        LoopsPractice obj = new LoopsPractice();

        obj.SumOfN(10);
        obj.fibonacci(10);
    }
}
