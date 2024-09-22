package insertion;

import java.util.Scanner;
import binaryTreeCreation.Tree;

public class Insertion {
	
	static Tree root;
	
	private static void printTree(Tree node) {
		
		if(node==null)
			return;
		printTree(node.left);
		System.out.print(node.data+" ");
		printTree(node.right);
	}
	
	private static void insert(Tree node,int key)
	{
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		root = new Tree(10); 
        root.left = new Tree(11); 
        root.left.left = new Tree(7); 
        root.right = new Tree(9); 
        root.right.left = new Tree(15); 
        root.right.right = new Tree(8); 
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
