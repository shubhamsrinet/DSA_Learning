package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Scanner;

public class TargetPathSumRecursive {

    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        //System.out.println("After Insertion");

        int target = sc.nextInt();
        System.out.println(pathSum(root,target));
        sc.close();
    }

    private static boolean pathSum(Tree root, int target) {
        if(root == null){
            return false;
        }

        target -= root.data;
        if(root.left == null && root.right == null){
            return target == 0;
        }
        return pathSum(root.left,target) || pathSum(root.right, target);
    }
}
