package dsa.tree.traversals;

import dsa.tree.binaryTree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalIterative {

    static Tree root;

    public static void main(String[] args){
        root = new Tree(1);
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);

        //1,2,4,5,3,6,7
        levelOrder(root);
    }

    private static void levelOrder(Tree root) {
        if(root == null)
            return;
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Tree node = queue.poll();
            System.out.print(node.data+",");
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
    }
}
