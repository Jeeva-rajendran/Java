import java.util.Arrays;
import java.util.List;
public class StreamExample{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,3,5,6,2,7);
        nums.forEach(n -> System.out.println(n));
    }
}