package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class KthSmallestElement {
    static Tree root;
    static int val=0;

    public static void main(String[] args) {
        root = new Tree(4);
        root.left = new Tree(1);
        root.right = new Tree(4);
        root.left.right = new Tree(2);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        System.out.println(kthSmallest(root,k));
        System.out.println(val);
    }

    private static boolean kthSmallest(Tree root, int k) {
        if(root == null)
            return false;
        if(k==0){
            val = root.data;
            return true;
        }
        kthSmallest(root.left,k-1);
        kthSmallest(root.right,k-1);

        return false;
    }
}
