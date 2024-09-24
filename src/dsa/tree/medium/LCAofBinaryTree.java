package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;


public class LCAofBinaryTree {
    static Tree root;

    public static void main(String[] args){
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.right.right = new Tree(5);
        root.right.left = new Tree(4);
        //1,2,4,5,3,6,7
        Tree val = lca(root,root.left,root.right.left);
        System.out.println(val.data);
    }

    private static Tree lca(Tree root, Tree node1, Tree node2) {

        if(root == null || root == node1 || root == node2)
            return root;

        Tree left = lca(root.left,node1,node2);
        Tree right = lca(root.right,node1,node2);

        if(left != null && right != null){
            return root;
        }
        return right != null ? right : left;
    }
}

//Steps to Find the LCA
//Base Case: If the current node is null, return null. If the current node is either of the two nodes, return the current node.
//Recursive Case: Recursively find the LCA in the left and right subtrees.
//Combine Results: If both the left and right recursive calls return non-null values, the current node is the LCA.
// If only one of the recursive calls returns a non-null value, return that value.