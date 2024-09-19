package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class AddLeftNodeSum {
    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        //System.out.println("After Insertion");

        System.out.println(addLeftNode(root,false));
        sc.close();
    }

        private static int addLeftNode(Tree root, boolean isLeft) {
            if(root == null){
                return 0;
            }
            if(isLeft && root.left == null && root.right == null){
                return root.data;
            }
            int leftSideLeftSum = addLeftNode(root.left,true);
            int rightSideLeftSum = addLeftNode(root.right,false);

            return leftSideLeftSum+rightSideLeftSum;
        }
}
