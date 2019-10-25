public class formPalindrome {
    public boolean isPalindrome(String text){
        for (int i=0; i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-i-1))
                return false;
        }
        return true;

    }

    public int formPalin (String word){
        int count=0;
        int size = word.length();
        StringBuilder b = new StringBuilder();
        if (word == null)
            return 0;
        if (isPalindrome(word))
            return 0;

        for (int i=1;i<size;i++) {
            if (isPalindrome(b.append(word.charAt(i) + word).toString())){
                return count;
            }
            else
                count ++;
        }

        return count;
        }


    public static void main(String[] args) {
        formPalindrome formPalindrome = new formPalindrome();
        System.out.println(formPalindrome.formPalin("ab"));
    }
}
