import java.util.HashMap;
import java.util.Map;

public class Collection2Example{
    public static void main(String[] args) {
        Map <String, Integer> students = new HashMap<>();

        students.put("Jeeva", 99);
        students.put("Pawan", 98);
        students.put("Karthik", 97);
        students.put("Hari", 96);
        students.put("Piyush", 95);
        students.put("Pawan", 90);      // Key cannot be duplicate.

        System.out.println(students);

        for (String n : students.keySet()){
            System.out.println(n + " : " + students.get(n));
        }
    }
}