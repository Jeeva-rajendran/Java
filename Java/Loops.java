public class Loops {
    public static void main(String[] args) {
        AllLoops.ForLoop();
        AllLoops.WhileLoop();
        AllLoops.DoWhileLoop();
    }
}

class AllLoops{
    public static void ForLoop(){
        for(int i=0; i<5; i++){
            System.out.println("Hello world " + i);
        }
    }

    public static void WhileLoop(){
        int i = 0;
        while (i<=4) {
            System.out.println("While Loop Hello world " + i);
            i++;
        }
    }
    public static void DoWhileLoop(){
        int i = 0;
        do{
            System.out.println("Do While Hello World " + i);
            i++;
        }while(i<=4);
    }
}