package find;

import binaryTreeCreation.Tree;

public class MinimumValue {

	static Tree root;
	
	private static int minValue(Tree node) {
		Tree currentNode = node;
		while(currentNode.left != null)
		{
			currentNode = currentNode.left;
		}
		
		return currentNode.data;
	}

	
	public static void main(String[] args) {
		root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		
		System.out.println(minValue(root));
		


	}
}
