package summation;

import binaryTreeCreation.Tree;

public class SumOfLeftChildNodes {

	static Tree root;
	
	private static int sumLeft(Tree root) {
		int sum =0;
		if(root == null)
			return 0;
		else
		{
			if(isLeaf(root.left))
			{
				sum = sum + root.left.data;
			}
			else
				sum = sum + sumLeft(root.left);
			sum = sum + sumLeft(root.right);
		}
		return sum;
	}

	
	
	private static boolean isLeaf(Tree node) {
		if(node == null)
			return false;
		else if(node.left == null && node.right == null)
			return true;
		return false;
	}



	public static void main(String[] args) {
		root = new Tree(20); 
        root.left = new Tree(9); 
        root.right = new Tree(49); 
        root.left.right = new Tree(12); 
        root.left.left = new Tree(5); 
        root.right.left = new Tree(23); 
        root.right.right = new Tree(52); 
        root.left.right.right = new Tree(12); 
        root.right.right.left = new Tree(50); 
        
        System.out.println(sumLeft(root));

	}




}
