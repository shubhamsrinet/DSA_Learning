package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class ANodeIsPresentOrNot {

    static Tree root;

    public static void main(String[] args) {
        root = new Tree(3);
        root.left = new Tree(1);
        root.right = new Tree(4);
        root.left.right = new Tree(2);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        System.out.println(kthSmallest(root,k));
    }

    private static boolean kthSmallest(Tree root, int k) {
        if(root == null)
            return false;
        if(root.data == k)
            return true;
        if(k >= root.data){
            return kthSmallest(root.right,k);
        }else
            return kthSmallest(root.left,k);
    }
}
