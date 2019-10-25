import java.util.HashMap;
import java.util.Map;

public class FrequencyGame {
    public static int mostFrequent (int [] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]+1));
            }
            else
                map.put(nums[i],1);

        }
        int max = 0; int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue()< min){
                min = entry.getValue();
                max = entry.getKey();

            }
            else if(entry.getValue()==min && entry.getKey()>max){
                max = entry.getKey();
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent(new int []  {2,2,5,50,1,3}));
    }
}
