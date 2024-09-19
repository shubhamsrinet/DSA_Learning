package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;
import java.util.Scanner;

public class BalancedBinaryTree {
    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(1);
        //root.left = new Tree(2);
        root.right = new Tree(2);
//        root.left.left = new Tree(4);
//        root.left.right = new Tree(5);
//        root.right.left = new Tree(4);
//        root.right.right = new Tree(5);
        //System.out.println("After Insertion");

        System.out.println(isBalanced(root));
        sc.close();
    }
    private static boolean isBalanced(Tree root) {
        return height(root) != -1;
    }
    private static int height(Tree root) {
        if(root == null)
            return 0;
        int left = height(root.left);
        if(left == -1)
            return -1;
        int right = height(root.right);
        if(right == -1)
            return -1;
        if(Math.abs(left - right) > 1)
            return -1;
        return 1+Math.max(left,right);
    }

}
/// here we are checking left or right returning -1 or not if any place it returns -1 it will be unbalanced.