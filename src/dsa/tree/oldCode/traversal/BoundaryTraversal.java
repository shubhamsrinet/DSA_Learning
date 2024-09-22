package traversal;

import binaryTreeCreation.Tree;

public class BoundaryTraversal {
 
	static Tree root;
	
	private static void printBoundary(Tree node) {
		if(node!=null)
		{
			System.out.print(node.data+" ");
		}
		printBoundaryLeft(node.left);
		
		printLeaves(node.left);
		printLeaves(node.right);
		
		printBoundaryRight(node.right);
		
	}

	private static void printLeaves(Tree node) {
		if(node!=null)
		{
			printLeaves(node.left);
			if(node.left==null && node.right == null)
			{
				System.out.print(node.data+" ");
			}
			printLeaves(node.right);
		}
		
	}

	private static void printBoundaryLeft(Tree node) {
		if(node!=null)
		{
			if(node.left!=null)
			{
				System.out.print(node.data+" ");
				printBoundaryLeft(node.left);
			}
			else if(node.right!=null)
			{
				System.out.print(node.data+" ");
				printBoundaryLeft(node.right);
			}
		}
		
	}

	private static void printBoundaryRight(Tree node) {
		
		if(node!=null)
		{
			if(node.right!=null)
			{
				printBoundaryRight(node.right);
				System.out.print(node.data+" ");
				
			}
			else if(node.left!=null)
			{
				printBoundaryLeft(node.left);
				System.out.print(node.data+" ");
			}
		}
	}

	public static void main(String[] args) {
		root = new Tree(20); 
        root.left = new Tree(8); 
        root.left.left = new Tree(4); 
        root.left.right = new Tree(12); 
        root.left.right.left = new Tree(10); 
        root.left.right.right = new Tree(14); 
        root.right = new Tree(22); 
        root.right.right = new Tree(25); 
        printBoundary(root);

	}

}
