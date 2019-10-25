public class interleavedStrings {
    public static boolean isInterleave(String a, String b, String c){
        String word = a+b;
        String text = b+a;
       for (int i  = 0;i<word.length();i++){
           if (word.charAt(i)!=c.charAt(i) && text.charAt(i)!=c.charAt(i))
               return false;
       }
       return true;

    }

    public static void main(String[] args) {
        System.out.println(isInterleave("yx", "x", "xxy"));
    }
}
