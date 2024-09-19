package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BothSideIdentical {

    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(2);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(4);
        root.right.right = new Tree(5);
        //System.out.println("After Insertion");

        System.out.println(symmetricTree(root));
        sc.close();
    }

    private static boolean symmetricTree(Tree root) {
        if(root.left == null || root.right == null){
            return false;
        }

        Tree root1 = root.left;
        Tree root2 = root.right;

        Queue<Tree> q1 = new LinkedList<>();
        Queue<Tree> q2 = new LinkedList<>();

        q1.offer(root1);
        q2.offer(root2);

        while(!q1.isEmpty() && !q2.isEmpty()){
            Tree node1 = q1.poll();
            Tree node2 = q2.poll();

            assert node2 != null;
            if(node1.data != node2.data){
                return false;
            }

            if(node1.left != null && node2.left != null){
                q1.offer(node1.left);
                q2.offer(node2.left);

            }else if(node1.left != null || node2.left != null){
                return false;
            }

            if(node1.right != null && node2.right != null){
                q1.offer(node1.right);
                q2.offer(node2.right);

            }else if(node1.right != null || node2.right != null){
                return false;
            }
        }
        return true;
    }
}
