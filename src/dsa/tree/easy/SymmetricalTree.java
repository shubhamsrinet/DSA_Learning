package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SymmetricalTree {
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

        System.out.println(sameTree(root,root2));
        sc.close();
    }

    private static boolean sameTree(Tree root, Tree root2) {

        if(root == null){
            return true;
        }

        Queue<Tree> q1 = new LinkedList<>();

        q1.offer(root);
        q1.offer(root);

        while(!q1.isEmpty()) {
            Tree leftNode = q1.poll();
            Tree rightNode = q1.poll();

            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null || leftNode.data != rightNode.data) {
                return false;
            }
                q1.offer(leftNode.left);
                q1.offer(rightNode.right);
                q1.offer(leftNode.right);
                q1.offer(rightNode.left);

        }
        return true;
    }
}
