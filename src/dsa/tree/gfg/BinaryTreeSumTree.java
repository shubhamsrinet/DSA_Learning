package dsa.tree.gfg;

import dsa.tree.binaryTree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeSumTree {
    static Tree root;

    public static void main(String[] args) {
        root = new Tree(26);
        root.left = new Tree(10);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right= new Tree(6);
        root.right.right = new Tree(3);
        System.out.println(sumTree(root));
    }

    private static boolean sumTree(Tree root) {
        int ls, rs;
        if(root == null || (root.left == null && root.right==null))
            return true;
        ls = sum(root.left);
        rs = sum(root.right);
        return (root.data == ls+rs) && sumTree(root.left) && sumTree(root.right);
    }

    private static int sum(Tree node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
           return node.data;
        int ldata = sum(node.left);
        int rdata = sum(node.right);
        return  ldata+rdata+node.data;
    }
}
