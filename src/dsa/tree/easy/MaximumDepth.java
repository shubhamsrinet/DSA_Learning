package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class MaximumDepth {
    static Tree root;
    static int left =0;
    static int right =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        //System.out.println("After Insertion");

        System.out.println(maximumDepth(root)-1);
        sc.close();
    }

    private static int maximumDepth(Tree root) {
        if(root == null){
            return 1;
        }
        left = maximumDepth(root.left)+1;
        right = maximumDepth(root.right)+1;

        return Math.max(left, right);
    }
}
