public class MetaString {
    public  static boolean isMetaString (String a, String b){
        int count =0;
         int prev =-1;
         int curr =-1;
        if (a ==null || b == null)
            return false;
        if (a.length()!=b.length())
            return false;
        for (int i=0;i<a.length();i++){
            char Achar  = a.charAt(i);
            char Bchar = b.charAt(i);
            if (Achar!=Bchar) {
               count++;
                if (count >2)
                    return false;
                prev = curr;
                curr=i;
            }
        }
           return (count ==2) && (a.charAt(prev)==b.charAt(curr)) && (b.charAt(prev)==a.charAt(curr));
    }

    public static void main(String[] args) {
        System.out.println(isMetaString("geeks","keegs"));
    }
}
