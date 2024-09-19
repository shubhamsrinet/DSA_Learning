package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;


//Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
public class UniqueBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(uniqueTrees(n));
        sc.close();
    }

    private static int uniqueTrees(int n) {

    }
}
