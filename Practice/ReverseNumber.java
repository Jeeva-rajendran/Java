public class ReverseNumber{
    public static void main(String[] args) {
    int num = 4321;
    int reverseNum = 0;
    while (num>0){
       int rem = num % 10;
       reverseNum *=10;
       reverseNum += rem;
       num /= 10;
    }
    System.out.println(reverseNum);
}
}
