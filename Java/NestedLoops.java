public class NestedLoops {
    public static void main(String[] args) {
        Pattern.square();
        Pattern.triangle();
    }
}


class Pattern{
    public static void square(){
        System.out.println("Square");
        int n = 5;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangle(){
        System.out.println("Right Angled Triangle");
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}