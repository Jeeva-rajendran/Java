class A {
    public void show(){
        System.out.println("In A show");
    }

    public void config(){
        System.out.println("In A config");
    }
    public int add(int x, int y){
        return x + y;
    }
}

class B extends A{
    public void show(){     // Method Overriding. It will call first child class show, if show() is not present in child class it will go to parent class like config() is not present in child class.        
    System.out.println("In B show");
    }
    public int add(int a,int b){
        System.out.println("In B");
        return a + b ;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); 
        obj.config(); 
        int r1 = obj.add(5,6);
        System.out.println(r1);
    }
}
