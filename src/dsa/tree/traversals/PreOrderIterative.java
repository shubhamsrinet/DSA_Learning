package dsa.tree.traversals;

import dsa.tree.binaryTree.Tree;

import java.util.Stack;

public class PreOrderIterative {
    static Tree root;

    public static void main(String[] args){
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);

        //1,2,4,5,3,6,7
        preOrder(root);
    }

    private static void preOrder(Tree root) {
        if(root == null){
            return;
        }
        Stack<Tree> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            Tree node = stack.pop();
            System.out.println(node.data);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }

        }
    }

}
