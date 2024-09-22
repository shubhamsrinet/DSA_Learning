package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumRootToLeafAll {
    static Tree root;

    //static List<List<Integer>> result = new ArrayList<>();
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
//        List<Integer> currentPath = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String str = "";
        findPaths(root, result,str);
        int res = 0;
        for(String s : result){
            res += Integer.parseInt(s);
        }
        System.out.println(res);
    }


    private static void findPaths(Tree root, List<String> result, String str) {
        if(root == null){
            return;
        }
        str += root.data;
        if(root.left == null && root.right == null){
            result.add(str);
        } else {
            findPaths(root.left, result, str);
            findPaths(root.right, result, str);
        }
    }
}
