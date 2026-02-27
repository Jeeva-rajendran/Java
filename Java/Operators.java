public class Operators {
        public static void main(String[] args) {
              Operations.ArthematicOperators(); 
              Operations.RelationalOperator();
              Operations.LogicalOperator();
        }
}

class Operations {
        public static void ArthematicOperators(){
        int a = 7;
        a += 2;
        a++;    // post increment
        a-- ;   // post decrement
        ++a;    // pre increment
        --a;    // pre decrement

        System.out.println(a);
        

        int ex = 5;
        int result1 = ex++; // first it fetch the value of num and then increment
        // int result1 = ++ex; // first increment and fetch the value
        System.out.println(result1);
        }

        public static void RelationalOperator(){
                int a = 5;
                int b = 8;
                boolean result = a > b;
                System.out.println(result);

                int k = 5;
                int q = 5;
                System.out.println(k >= q);
        }

        public static void LogicalOperator(){
                int a = 5;
                int b = 6;
                int x = 10;
                int y = 20;
                boolean result = a > b;         //false
                System.out.println("Value of result: " + !result);
                System.out.println(a < b && x < y); 
        }
        
}
