package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {
    static Tree root;

    public static void main(String[] args){
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.right.right = new Tree(5);

        List<List<Integer>> list = new ArrayList<>();
        //1,2,4,5,3,6,7
        System.out.println(zigLevelOrderWithList(root,list));
    }

    private static List<List<Integer>> zigLevelOrderWithList(Tree root, List<List<Integer>> list) {
        if(root == null)
            return new ArrayList<>();
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        int level=0;
        boolean zig = true;
        while(!queue.isEmpty()){
            LinkedList<Integer> list1 = new LinkedList<>();
            level = queue.size();
                for(int i=0;i<level;i++){
                    Tree node = queue.poll();
                    if(zig){
                        list1.addLast(node.data);
                    }else{
                        list1.addFirst(node.data);
                    }
                    if(node.left != null){
                        queue.offer(node.left);
                    }
                    if(node.right != null){
                        queue.offer(node.right);
                    }
                }
                zig = !zig;
                list.add(list1);
        }
      return list;
    }
}


//Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
// (i.e., from left to right, then right to left for the next level and alternate between).
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[20,9],[15,7]]