package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class SameTree {
    static Tree root;
    static Tree root2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);

        root2 = new Tree(1);
        root2.left = new Tree(2);
        root2.right = new Tree(3);
        //System.out.println("After Insertion");

        System.out.println(sameTree(root,root2));
        sc.close();
    }

    private static boolean sameTree(Tree root, Tree root2) {
        if(root == null &&  root2 == null){
            return true;
        }
        if(root == null || root2 == null){
            return false;
        }
        return (root.data == root2.data) && sameTree(root.left,root2.left) && sameTree(root.right,root2.right);
    }
}
