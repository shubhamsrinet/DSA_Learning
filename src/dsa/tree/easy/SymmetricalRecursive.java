package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class SymmetricalRecursive {
    static Tree root;
    static Tree root2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(3);
        root.left.right = new Tree(4);

        root2 = new Tree(1);
        root2.right = new Tree(2);
        root2.right.right = new Tree(3);
        root2.right.left = new Tree(4);
        //System.out.println("After Insertion");

        System.out.println(symmetricalRecursive(root,root2));
        sc.close();
    }

    private static boolean symmetricalRecursive(Tree root, Tree root2) {
        if(root == null && root2 == null){
            return true;
        }

        if(root != null && root2 !=null && (root.data == root2.data)){
            return (symmetricalRecursive(root.left, root2.right) && symmetricalRecursive(root.right,root2.left));
        }

        return false;
    }
}
