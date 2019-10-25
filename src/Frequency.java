public class Frequency {
    public  int first(int [] nums, int x) {
        for (int i = 0;i<nums.length;i++){
            if (nums[i]==x)
                return i;
        }
        return -1;
    }
    public  int last(int [] nums, int x) {
        for (int i =nums.length-1;i>=0;i--){
            if (nums[i]==x)
                return i;
        }
        return -1;
    }
    public  int countFrequency(int [] nums, int x)
    {
        int i = first(nums,x);
        int j = last(nums,x);
        return j-i+1;

    }
    public static void main(String[] args) {
        System.out.println(new Frequency().countFrequency(new int [] {1,2,2,2,2,3}, 2));
    }
}
