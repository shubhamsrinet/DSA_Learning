package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.ArrayList;
import java.util.List;

public class ZigZagLevelOrderTraversal {
    static Tree root;

    public static void main(String[] args){
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);

        List<List<Integer>> list = new ArrayList<>();
        //1,2,4,5,3,6,7
        System.out.println(zigLevelOrderWithList(root,list));
    }

    private static List<List<Integer>> zigLevelOrderWithList(Tree root, List<List<Integer>> list) {
      return null;
    }
}
