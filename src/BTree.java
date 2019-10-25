import java.util.*;

public class BTree {
   static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right = null;
        }
    }
   public static int sumToleaf (Node root, int counter ){

       if (root == null)
           return 0;
       counter = counter *10 + root.data;
        if (root.left==null && root.right == null){
            return counter;
        }

       return sumToleaf(root.left, counter) + sumToleaf(root.right, counter);


   }
   public static int kthSmallest(Node root, int k) {
       Stack<Node> stack = new Stack<>();
           while (root != null||!stack.isEmpty()) {
               if (root != null) {
                   stack.push(root);
                   root = root.left;
               } else {
                   root = stack.pop();
                   k--;
                   if (k==0)
                       return root.data;
                   root = root.right;
               }
           }
       return 0;
   }
  public static int start(Node root){
       return sumToleaf(root,0);
  }
    public static void main(String[] args) {
      Node  root = new Node (20);
      root.left = new Node(8);
      root.right = new Node(22);
      root.left.left = new Node(4);
      root.left.right = new Node(12);
        root.right.left = new Node(21);
        System.out.println(kthSmallest(root,6));

    }
}
