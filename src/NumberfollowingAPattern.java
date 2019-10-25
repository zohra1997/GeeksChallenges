import java.util.Stack;

public class NumberfollowingAPattern {
    public static void function (String pattern){
        Stack <Integer> stack = new Stack<>();
        for (int i=0;i<=pattern.length();i++){
            stack.push(i+1);
            if (i ==pattern.length() || pattern.charAt(i)=='I'){
                while (!stack.isEmpty()) {
                    System.out.print(stack.peek());
                    stack.pop();
                }
            }
        }
    }

    public static void main(String[] args) {
        function("IIDDIDD");
    }
}
