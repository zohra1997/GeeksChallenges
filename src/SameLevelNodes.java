import jdk.dynalink.NamedOperation;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class SameLevelNodes {
    static class Node {
        int val;
        Node left, right, nextRight;

        Node(int val) {
            this.val = val;
            right = null;
            left = null;
            nextRight = null;
        }


        public static void sameLevelNodes(Node root) {
            if (root == null)
                return;
            if (root.left != null) {
                root.left.nextRight = root.right;
            }
            if (root.right != null) {
                if (root.nextRight == null)
                    root.right.nextRight = null;
                else
                    root.right.nextRight = root.nextRight.left;
            }
            sameLevelNodes(root.left);
            sameLevelNodes(root.right);

        }

        public static void start(Node root) {
            root.nextRight = null;
            sameLevelNodes(root);
        }
    }
        // Driver program to test above functions
        public static void main(String args[]) {
            Node root = new Node(10);
            root.left = new Node(8);
            root.right = new Node(2);
            root.left.left = new Node(3);
            Node.start(root);
        /* Constructed binary tree is
             10
            /  \
          8     2
         /
        3
        */
            // Populates nextRight pointer in all nodes


            // Let us check the values of nextRight pointers
            System.out.println("Following are populated nextRight pointers in "
                    + "the tree" + "(-1 is printed if there is no nextRight)");
            int a = root.nextRight != null ? root.nextRight.val : -1;
            System.out.println("nextRight of " + root.val + " is "
                    + a);
            int b = root.left.nextRight != null ?
                    root.left.nextRight.val : -1;
            System.out.println("nextRight of " + root.left.val + " is "
                    + b);
            int c = root.right.nextRight != null ?
                    root.right.nextRight.val : -1;
            System.out.println("nextRight of " + root.right.val + " is "
                    + c);
            int d = root.left.left.nextRight != null ?
                    root.left.left.nextRight.val : -1;
            System.out.println("nextRight of " + root.left.left.val + " is "
                    + d);
        }

}

