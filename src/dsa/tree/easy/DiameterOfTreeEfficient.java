package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class DiameterOfTreeEfficient {
    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        //System.out.println("After Insertion");

//        System.out.println(diameterOfTree(root));
        sc.close();
    }

//    private static int diameterOfTree(Tree root) {
//
//
//
//    }

}
