package dsa.tree.binaryTree;

import java.util.Scanner;

public class Insertion {
	
	static Tree root;
	
	private static void printTree(Tree node) {
		if(node==null)
			return;
		printTree(node.left);
		System.out.print(node.data+" ");
		printTree(node.right);
	}
	
	private static Tree insert(Tree root,int value) {
		if(root == null){
			root = new Tree(value);
			return root;
		}
		if(value < root.data){
			root.left = insert(root.left,value);
		}
		if(value > root.data){
			root.right = insert(root.right,value);
		}
        return root;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(4);
        root.right = new Tree(3);
        root.right.left = new Tree(5);
        root.right.right = new Tree(6);
        System.out.println("Before Insertion Tree is :");
        
        printTree(root);
        System.out.println("Enter number you want to enter in Tree");
        int key = sc.nextInt();
        insert(root,key);
        
        System.out.println("After Insertion");
        printTree(root);
        sc.close();
	}
}
