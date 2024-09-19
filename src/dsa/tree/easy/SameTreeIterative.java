package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SameTreeIterative {
    static Tree root;
    static Tree root2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);

        root2 = new Tree(1);
        root2.left = new Tree(2);
        root2.right = new Tree(3);
        //System.out.println("After Insertion");

        System.out.println(sameTreeItr(root,root2));
        sc.close();
    }

    private static boolean sameTreeItr(Tree root, Tree root2) {
        if(root == null && root2 == null){
            return true;
        }

        if(root == null || root2 == null){
            return false;
        }
        Queue<Tree> q1 = new LinkedList<>();
        Queue<Tree> q2 = new LinkedList<>();

        q1.offer(root);
        q2.offer(root2);

        while(!q1.isEmpty() && !q2.isEmpty()) {
            Tree node1 = q1.poll();
            Tree node2 = q2.poll();

            if (node1.data != node2.data) {
                return false;
            }
            if (node1.left != null && node2.left != null) {
                q1.offer(node1.left);
                q2.offer(node2.left);
            }
            else if (node1.left != null || node2.left != null) {
                return false;
            }
            if (node1.right != null && node2.right != null) {
                q1.offer(node1.right);
                q2.offer(node2.right);
            }
            else if (node1.right != null || node2.right != null) {
                return false;
            }
        }
        return true;
    }
}
