package dsa.tree.binaryTree;

public class NewTreeCreate {
     static Tree root;

     public static void main(String[] args){
         root = new Tree(1);
         root.left = new Tree(2);
         root.right = new Tree(3);
         root.left.left = new Tree(4);
         root.left.right = new Tree(5);
         root.right.left = new Tree(6);
         root.right.right = new Tree(7);

         printTree(root);
     }

    private static void printTree(Tree root) {
         if(root == null){
             return;
         }
         printTree(root.left);
         System.out.print(root.data+" ");
        printTree(root.right);
    }
}
