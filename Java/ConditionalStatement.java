public class ConditionalStatement {
    public static void main(String[] args) {
        ConditionProgram.GreaterThan();
        ConditionProgram.AgeCheck();
        ConditionProgram.ThreeGreaterNumber();
        ConditionProgram.TernaryOperator();
        ConditionProgram.Switch();
        ConditionProgram.UpdatedSwitch();
    }    
}

class ConditionProgram{
    public static void GreaterThan(){
        int a = 5;
        int b = 10;
        if (b > a) System.out.println("B is greater than A");

        else System.out.println("A is greater than B");
    }
    public static void AgeCheck(){
        int age = 20;
        String gender = "Male";
        if (age > 18 && gender == "Male") System.out.println("You can vote ");
        else System.out.println("You cannot vote ");
    }
    public static void ThreeGreaterNumber(){
        int x = 5;
        int y = 10;
        int z = 15;
        if (x>y && x > z) System.out.println("X is Greater");
        else if (y > z && y > x) System.out.println("Y is Greater");
        else System.out.println("Z is Greater");
    }

    public static void TernaryOperator(){
        int x = 6;
        int result = 0;
        result = (x%2==0) ? 10 : 20;
        System.out.println(result);
    }

    public static void Switch(){
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday"); 
                break;
            case 3: 
                System.out.println("Wednesday");
                break;

            case 4: 
                System.out.println("Thursday");
                break;

            case 5: 
                System.out.println("Friday");
                break;

            case 6: 
                System.out.println("Saturday");
                break;

            case 7: 
                System.out.println("Sunday");
                break;

            default:
                break;
        }
    
    }
    public static void UpdatedSwitch(){
        // Updated version switch, we don't have to mention break also.
        // In this it can return a value.
        String day = "Sunday";
        String result;
        result = switch (day) {
            case "Saturday","Sunday" -> "8am";
                
            case "Monday" -> "6am";
        
            default -> "7am";
        };
        System.out.println(result);
    }

    // With yeild 
    public static void UpdatedSwitch2(){
        // Updated version switch, we don't have to mention break also.
        // In this it can return a value.
        String day = "Sunday";
        String result;
        result = switch (day) {
            case "Saturday","Sunday" : yield "8am";
                
            case "Monday" : yield "6am";
        
            default : yield "7am";
        };
        System.out.println(result);
    }
}
