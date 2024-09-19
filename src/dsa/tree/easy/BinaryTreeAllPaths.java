package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeAllPaths {
    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.right = new Tree(5);
        //System.out.println("After Insertion");

        List<String> list = new ArrayList<>();
        System.out.println(allPaths(root,"",list));
        sc.close();
    }

    private static List<String> allPaths(Tree root, String str, List<String> list) {
        if(root == null){
            return null;
        }
        str += root.data+ "->";
        if(root.left == null && root.right == null){
            list.add(str.substring(0,str.length()-2));
        }
        allPaths(root.left, str, list);
        allPaths(root.right, str, list);
        return list;
    }
}
