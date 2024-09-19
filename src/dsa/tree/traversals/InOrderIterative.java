package dsa.tree.traversals;

import dsa.tree.binaryTree.Tree;

import java.util.Stack;

public class InOrderIterative {
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
        inOrder(root);
    }

    private static void inOrder(Tree root) {

        Stack<Tree> stack = new Stack<>();
        Tree curr = root;

        while (curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
        }

    }
}
