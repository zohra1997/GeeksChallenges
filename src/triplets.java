import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class triplets {
  public int [] twoSum (int [] nums , int target){
      HashMap<Integer, Integer> map  = new HashMap<>();
      int [] res = new int[2];
      for (int i=0;i<nums.length; i++){
          int diff = target- nums[i];
          if (map.containsKey(diff)){
              res [0]=map.get(nums[i]);
              res[1] =map.get(diff);
          }
          else
              map.put(nums[i],i);
      }
      return res;
  }
  public static boolean threeSum(int [] nums){
      for (int i=0;i<nums.length-1;i++){
          HashSet<Integer> set = new HashSet<>();
          for (int j =i+1;j<nums.length;j++){
              int diff = - (nums[i]+nums[j]);
              if (set.contains(diff)){
                  return true;
              }
              set.add(nums[j]);
          }
      }
      return false;
  }




    public static void main(String[] args) {
        System.out.println(threeSum(new int [] {0,-1,2,-3,1}));
    }
}
