package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class DiameterOfTreeNaiveApproach {

    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        //System.out.println("After Insertion");
        
        System.out.println(diameter(root));
        sc.close();
    }

    private static int diameter(Tree root) {

        if(root == null){
            return 0;
        }
        int d1 = 1+height(root.left)+height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1, Math.max(d2,d3));
    }

    private static int height(Tree root) {
        if(root == null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
