import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class ComparatorExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(31);
        nums.add(64);
        nums.add(72);
        nums.add(89);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i%10 > j%10)
                    return 1;
                else
                    return -1; 
            }
        };
        // Sorting Element based on the last element.
        Collections.sort(nums, com);
        System.out.println(nums);

        // DataType is Student.
        List<Student> studs = new ArrayList<>();

        studs.add(new Student("Aradhiya", 18));
        studs.add(new Student("Anjali", 20));
        studs.add(new Student("Ananya", 23));
        studs.add(new Student("Anshika", 22));

        Comparator<Student> com1 = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if (i.age > j.age)
                    return 1;
                else
                    return -1; 
            }
        };

        Collections.sort(studs, com1);
        System.out.println(studs);

        for(Student s : studs){
            System.out.println(s);
        }
    }
}
