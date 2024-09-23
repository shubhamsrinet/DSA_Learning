package summation;

import binaryTreeCreation.Tree;

public class SumOfAllNodes {

	static Tree root;
	
	private static int sumNodes(Tree node) {
		if(node == null)
			return 0;
		else
			return (node.data + sumNodes(node.left) + sumNodes(node.right));
	}

	
	public static void main(String[] args) {
		root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		
		System.out.println(sumNodes(root));
	}
}
