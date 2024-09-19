package dsa.tree.traversals;

import dsa.tree.binaryTree.Tree;

public class PreOrderRecursive {
    static Tree root;

    public static void main(String[] args){
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

        //1,2,4,5,3,6,7
        preOrder(root);
    }

    private static void preOrder(Tree root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
