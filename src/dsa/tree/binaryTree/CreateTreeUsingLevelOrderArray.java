package dsa.tree.binaryTree;

import java.util.*;

public class CreateTreeUsingLevelOrderArray {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        Integer[] array = new Integer[length];
        System.out.println("Enter the array here :");
        for (int i = 0; i < length; i++) {
            int value = sc.nextInt();
            if (value == -1) {
                array[i] = null;
            } else {
                array[i] = value;
            }
        }

        //1,2,4,5,3,6,7
        Tree root = constructTreeRecursively(array);
        List<Integer> list = new ArrayList<>();
        printTree(root,list);
        System.out.println(list);

    }

    private static Tree constructTreeRecursively(Integer[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            return null;
        }
        Tree root = new Tree(levelOrder[0]);
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < levelOrder.length) {
            Tree node = queue.poll();
            if (index < levelOrder.length && levelOrder[index] != null) {
                node.left = new Tree(levelOrder[index]);
                queue.add(node.left);
            }
            index++;
            if (index < levelOrder.length && levelOrder[index] != null) {
                node.right = new Tree(levelOrder[index]);
                queue.add(node.right);
            }
            index++;
        }
        return root;
    }

    private static void printTree(Tree node, List<Integer> list) {
        if(node==null)
            return;
        list.add(node.data);
        printTree(node.left, list);
        printTree(node.right, list);
    }
}
