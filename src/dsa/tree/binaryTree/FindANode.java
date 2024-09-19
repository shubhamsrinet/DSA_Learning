package dsa.tree.binaryTree;

import java.util.Scanner;

public class FindANode {

    static Tree root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = new Tree(3);
        root.left = new Tree(2);
        root.left.left = new Tree(1);
        root.right = new Tree(4);
        root.right.right = new Tree(5);
        System.out.println("Before Insertion Tree is :");

        System.out.println("Enter number you want to Search");
        int key = sc.nextInt();

        //System.out.println("After Insertion");
        Tree tree = findANode(root,key);
        if(tree != null){
            System.out.println("It is found in Tree");
        }else{
            System.out.println("It is not found in Tree");
        }
        sc.close();
    }

    private static Tree findANode(Tree root, int key) {
        if(root == null || root.data == key){
            return root;
        }
        if(root.data > key){
            return findANode(root.left,key);
        }
        else{
            return findANode(root.right,key);
        }
    }
}
