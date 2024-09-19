package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class ValidateBinarySearchTree {
    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(2);
        root.left = new Tree(1);
        root.right = new Tree(3);
        //System.out.println("After Insertion");

        System.out.println(validateTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }

    private static boolean validateTree(Tree root, int minValue, int maxValue) {
        if(root == null)
            return true;
        if(root.data <=  minValue || root.data >= maxValue){
            return false;
        }
        return validateTree(root.left, minValue, root.data) && validateTree(root.right, root.data, maxValue);
    }
}


//    Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//    A valid BST is defined as follows:
//    The left
//    subtree
//    of a node contains only nodes with keys less than the node's key.
//    The right subtree of a node contains only nodes with keys greater than the node's key.
//    Both the left and right subtrees must also be binary search trees.
