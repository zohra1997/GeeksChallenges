import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class fizzbuzz {
    Map<Integer, String> map;
    public fizzbuzz(){
        map = new HashMap<>();
        map.put(3, "fizz");
        map.put(5,"Buzz");
        map.put(15,"fizzBuzz");

    }

    public String function (int [] nums ){
        StringBuilder output =  new StringBuilder("");
        Set<Integer> keys = map.keySet();
        for (int i=0;i<nums.length;i++){
            if (keys.contains(nums[i]))
                output.append(map.get(nums[i])).append(" ");

        }
      return output.toString();
    }

    public static void main(String[] args) {
        fizzbuzz f = new fizzbuzz();
        int [] nums = {1,2,3,4,5,15};
        System.out.println(f.function(nums));
    }
}
