import java.lang.reflect.Array;
import java.util.Arrays;

public class kLargestElement {
    public static int [] kthlargest (int [] nums, int k){
        int [] result = new int [k];
        for (int i=0;i<k;i++){
            int max =0;
            int maxIndex=0;
            for(int j=0;j<nums.length;j++){
                if (nums[j]>max) {
                    max = nums[j];
                    maxIndex= j;
                }
            }
            result[i]=max;
            nums[maxIndex]=0;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] array= kthlargest(new int [] {12,5,787,1,23},2);
        Arrays.stream(array).forEach(i->System.out.println(i));
    }
}
