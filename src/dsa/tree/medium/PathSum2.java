package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf
// path such that adding up all the values along the path equals targetSum.
//A leaf is a node with no children.
public class PathSum2 {
    static Tree root;

    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(5);
        root.left = new Tree(4);
        root.right = new Tree(8);
        root.left.left = new Tree(11);
        root.left.left.left = new Tree(7);
        root.left.left.right = new Tree(2);
        root.right.left = new Tree(13);
        root.right.right = new Tree(4);
        root.right.right.left = new Tree(5);
        root.right.right.right = new Tree(1);
        int target = sc.nextInt();
        sc.close();
        List<Integer> currentPath = new ArrayList<>();
        findPaths(root, target, currentPath, result);
        System.out.println(result);
    }


    private static void findPaths(Tree root, int target, List<Integer> currentPath, List<List<Integer>> result) {
        if(root == null){
            return;
        }
        currentPath.add(root.data);
        if(root.left == null && root.right == null && root.data == target){
            result.add(new ArrayList<>(currentPath));
        } else {
            findPaths(root.left, target - root.data, currentPath, result);
            findPaths(root.right, target - root.data, currentPath, result);
        }
        currentPath.remove(currentPath.size()-1);
    }
}
