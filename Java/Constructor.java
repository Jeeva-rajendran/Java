class Human{
    String name;
    int age;

    public Human(String name, int age){     // Parameterized constructor.
        this.name = name;
        this.age = age;
        System.out.println(name + " : " + age );
    }

    public Human(){     // Default constructor.
        name = "Rohit";
        age = 23;
        System.out.println(name + " : " + age);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human("Jeeva",21);
        Human obj1 = new Human();
        Human obj2 = new Human("Kavin", 22);

        System.out.println(obj.getClass().getName());       // To check the data type of any variable.
        System.out.println(obj1.getClass().getName());       // To check the data type of any variable.
        System.out.println(obj2.getClass().getName());       // To check the data type of any variable.
    }
}
