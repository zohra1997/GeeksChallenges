import kotlin.jvm.internal.MagicApiIntrinsics;

public class coins {
    static int optimalStrategyOfGame(int arr[], int n)
    {
        int table[][] = new int[n][n];
        int gap, i, j, x, y, z;
        for (gap = 0; gap < n; ++gap) {
            for (i = 0, j = gap; j < n; ++i, ++j) {
                x = ((i + 2) <= j) ? table[i + 2][j] : 0;
                y = ((i + 1) <= (j - 1)) ? table[i + 1][j - 1] : 0;
                z = (i <= (j - 2)) ? table[i][j - 2] : 0;

                table[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));
            }
        }
      for (int [] a : table) {
          for (int k : a) {
              System.out.print(k + " ");
          }
          System.out.println();
      }

        return table[0][n - 1];
    }


    public   static  int game (int [] nums , int i , int j){
        if (i>=nums.length || j>=nums.length|| i<0 || j<0)
            return 0;
        if (i ==j)
            return nums [i];
        if (j==i+1)
            return Math.max(nums[i],nums[j]);
        return  Math.max(nums[i]+ Math.min(game(nums,i+2, j),game(nums,i+1, j-1)), nums[j] + Math.min(game(nums, i,j-2), game(nums,i+1,j-1)));


    }
    public static void main(String[] args) {
        int [] values = new int []{5,3,7,10};
        System.out.println(optimalStrategyOfGame(values,4));
    }
}
