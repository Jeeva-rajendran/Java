class Human{
    private String name;
    private int age;

    public int getAge(){
        return age;
    }

    // public void setAge(int age, Human obj){
    //     Human obj1 = obj;
    //     obj1.age = age;
    // }

    public void setAge(int age){
        this.age = age;     // this represent current object.
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        
        // obj.setAge(21, obj);
        obj.setAge(21);
        System.out.println(obj.getAge());

        obj.setName("Jeeva");
        System.out.println(obj.getName());
    }
}
