import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wordbreak {
 public static void  isSegmented(List<String> list , String word,String out ){
    if (word.length()==0)
        System.out.print(out);
   for (int i=1;i<word.length();i++){
       if (list.contains(word.substring(0,i))){
           isSegmented(list,word.substring(i),out + " "+ word.substring(0,i));
       }
   }
 }
    public static String longestCommonPrefix(String[] strs) {
    String wod = strs[0];
    for (int i=1;i<strs.length;i++){
        while (strs[i].indexOf(wod)!=0 && wod.length()>0 )
            wod = wod.substring(0,wod.length()-1);
    }
    return wod;
    }
    public static void main(String[] args) {
        String [] a = new String [] {"float","flower","fly"};
        System.out.println(longestCommonPrefix(a));
    }
}
