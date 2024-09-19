package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class CountCompleteTreeNodes {
    static Tree root;
    static int left=0;
    static int right=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        //System.out.println("After Insertion");
        
        System.out.println(countNodes(root));
        sc.close();
    }

    private static int countNodes(Tree root) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return 1+leftCount+rightCount;
    }
}
