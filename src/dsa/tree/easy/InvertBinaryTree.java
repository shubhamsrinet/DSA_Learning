package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class InvertBinaryTree {

    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        //System.out.println("After Insertion");

        sc.close();
        System.out.println(invertTree(root));
        printTree(root);


    }

    private static Tree invertTree(Tree root) {
        if(root == null){
            return null;
        }
        Tree leftNode = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = leftNode;

        return root;
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
