package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.*;

public class LevelOrderTraversalWithList {
    static Tree root;

    public static void main(String[] args){
        root = new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);

        List<List<Integer>> list = new ArrayList<>();
        //1,2,4,5,3,6,7
        System.out.println(levelOrderWithList(root,list));
    }

    private static List<List<Integer>> levelOrderWithList(Tree root, List<List<Integer>> list) {

        if(root == null)
            return null;
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        Stack<List<Integer>> stack = new Stack<>();
        int level =0;
        while(!queue.isEmpty()){
            List<Integer> list1 = new ArrayList<>();
            level = queue.size();
            for(int i=0;i<=level-1;i++){
                Tree node = queue.poll();
                System.out.println(node.data);
                list1.add(node.data);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            stack.push(list1);
        }

        for(int i=stack.size();i>0;i--){
            List<Integer> l = stack.pop();
            list.add(l);
        }
        return list;
    }
}
