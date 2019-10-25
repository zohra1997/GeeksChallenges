import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulation {
    public char [] removeChars (String word){
        char [] words = word.toCharArray();
        int j =0;
        for (int i =0;i<word.length();i++){
            if (words[i]=='a'|| words[j]=='A'){
                j=i+1;
                if (words[j]=='c' || words[j]=='C'){
                    words[i]=0;
                    words[j]=0;
                    i++;
                }
            }
            else if (words[i]=='b'||words[i]=='B')
                words[i]=0;
        }
        return words;
    }


    public boolean wordBreak (String text, List<String> words){

       boolean [] array = new boolean[text.length()+1];
       array[0]= true;
       int i =0, j=0;
       int len = text.length();
       while (i<len){
           i=j;
           while (j<=len){
               if (array[i]&& words.contains(text.substring(i,j))) {
                   array[j]=true;
                   i=j;
                   break;
               }
               j++;

           }
       }
        System.out.println(len);
        return array[len];
    }
    public String LongestWord (String text, List<String> dictionary){
         int [] array = new int [dictionary.size()];
        for (int i=0;i<dictionary.size();i++) {
            array[i] = countCommonChars(dictionary.get(i), text);
        }
         int max = 0;
        int index = 0;
         for (int i=0;i<array.length;i++) {
             if (array[i] > max) {
                 max = array[i];
                 index = i;
             }
         }
      return dictionary.get(index);
    }
    public int countCommonChars(String word, String sequence){
        int i=0;
        for (int j=0;j<sequence.length();j++){
            if (word.charAt(i)==sequence.charAt(j)){
                i++;
            }
            if (i==word.length())
                break;
        }
        return i;
    }

    public String longestCommonPrefix(String[] strs) {
        String base = strs[0];
        String s = "";
        for (int i =1; i<strs.length; i++ ){
            s = strs[i];
            while (base.indexOf(s.substring(0,s.length()))!=0){
                s= s.substring(0,s.length()-1);
            }
        }
        return s;
    }
    public static void main(String[] args) {
       StringManipulation  s = new StringManipulation();
//        System.out.println(s.removeChars("aabacc"));
   //   List<String> words = Arrays.asList(new String [] {"ale","apple","monkey","plea"});
//        String text = "aaaaaaa";
//        System.out.println(s.wordBreak(text,words));
        System.out.println(s.longestCommonPrefix(new String [] {"flower", "flows","flying","f"}));
    }
}
