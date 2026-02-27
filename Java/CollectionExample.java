import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionExample {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(3);
        // nums.add("5");
        // System.out.println(nums);
        // for (int n : nums){
        //     System.out.println(n);
        // }

        Iterator <Integer> values = nums.iterator();

        while (values.hasNext()) 
            System.out.println(values.next());

    }
}
