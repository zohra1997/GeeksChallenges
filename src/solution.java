public class solution {

    public static int reverse(int x) {
        int y = x;
        int res = 0;
        if (y > Integer.MAX_VALUE)
            return 0;
        if (y < 0)
            y = y * (-1);
        while (y > 0) {
            int rem = y % 10;
            res = res * 10 + rem;
            y = y / 10;
        }

        if (x < 0)
            return -res;
        else
            return res;
    }

    public static int strStr(String h, String n) {
        int hl = h.length();
        int nl = n.length();
        int j = 0;
        if (nl > hl)
            return -1;
        if (nl == 0)
            return 0;
        if (n.equals(h))
            return 0;

        for (int i = 0; i < hl-nl; i++) {
           if (h.substring(i,i+nl).equals(n))
               return i;
        }
        return -1;
    }

    public static String countAndSay(int n) {
        StringBuilder curr=new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for (int i=1;i<n;i++){
            prev=curr;
            curr=new StringBuilder();
            count=1;
            say=prev.charAt(0);

            for (int j=1,len=prev.length();j<len;j++){
                if (prev.charAt(j)!=say){
                    curr.append(count).append(say);
                    count=1;
                    say=prev.charAt(j);
                }
                else count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();

    }

        public static void main (String[]args){
            System.out.println(countAndSay(4));
        }
    }
