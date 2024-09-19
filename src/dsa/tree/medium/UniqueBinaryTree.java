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
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int nodes = 2;nodes <= n ;nodes++){
            for(int root =1; root <= nodes; root++){
                dp[nodes] += dp[root-1] * dp[nodes-root];
            }
        }
        return dp[n];
    }
}
