public class letterCombination {
    public static int count (int n){
        return 1+ n +n +n*(n-1)+n*(n-1)/2 +n*(n-1)*(n-2)/2;

    }

    public static void main(String[] args) {
        System.out.println(countRecusion(3,1,2));
    }
    public static int countRecusion (int n, int a, int b){
        if (a<0 || b<0)
            return 0;
        if (n==0)
            return 1;
        if (a == 0 || b ==0)
            return 1;
        int res = countRecusion(n-1, a,b);
         res =res + countRecusion(n-1,(a-1),b);
         res = res+ countRecusion(n-1, a,b-1);
        return res;

    }
}
