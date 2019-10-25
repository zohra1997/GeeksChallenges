import java.util.ArrayList;
import java.util.List;

public class BST {
     static class Node {
        int data;
        Node left, right;
        Node (int data ){
            this.data = data;
            right = null;
            left = null;
        }
    }

    public int countNodes(Node root, int min , int max ){
        if (root == null)
            return 0;
         if (root.data>=min && root.data<=max){
             return 1+countNodes(root.left,min,max) +countNodes(root.right,min,max);
         }
         else if (root.data<min){
            return  countNodes(root.right,min,max);
         }
         else
            return countNodes(root.left,min,max);

    }

    public ArrayList<Integer> mergeTrees (List<Integer>l1 , List<Integer> l2 ) {
         ArrayList<Integer> finalList = new ArrayList<>();
         int size1 =l1.size();
         int size2 = l2.size();
         int i=0,j=0;
         while (i<size1 && j<size2){
             if (l1.get(i)==l2.get(j)){
                 finalList.add(l1.get(i));
                         i++;
                         j++;
             }
             else if (l1.get(i)<l2.get(j)){
                 finalList.add(l1.get(i));
                 i++;
             }
             else {
                 finalList.add(l2.get(j));
                 j++;
             }
         }


         while(j<size2){
             finalList.add(l2.get(j));
             j++;
         }
        while(i<size1){
            finalList.add(l1.get(i));
            i++;
        }


         return finalList;

    }
     public List<Integer> InorderTraversal (Node root, List<Integer> list){
         if (root == null)
             return  list;
         InorderTraversal(root.left,list);
         list.add(root.data);
         InorderTraversal(root.right,list);
            return list;
        }


        public Node constructTree (ArrayList<Integer> list, int start, int end){
         if (start>end)
             return null;
         int mid =(start+end)/2;
         Node node = new Node (list.get(mid));
         node.left = constructTree(list, start,mid-1);
         node.right = constructTree(list,mid-1,end);
         return node;

        }

    public static void main(String[] args) {
        BST tree = new BST();
        Node root = new Node(6);
        root.left = new Node(1);
        root.right = new Node(7);
        Node root2 = new Node(1);
        root2.right = new Node(4);
        root2.right.right = new Node(33);
        List <Integer> list = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();
        System.out.println(tree.mergeTrees(tree.InorderTraversal(root, list),tree.InorderTraversal(root2,list2)));

    }
}
