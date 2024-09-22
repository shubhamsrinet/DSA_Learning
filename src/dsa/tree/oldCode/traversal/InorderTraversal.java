package traversal;

import binaryTreeCreation.Tree;

public class InorderTraversal {

	static Tree root;
	
	public void inOrder(Tree node) {
		
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}


	public static void main(String[] args) {
		InorderTraversal tree = new InorderTraversal();
		root = new Tree(10);
		Tree c1 = new Tree(11);
		Tree c2 = new Tree(12);
		Tree c3 = new Tree(13);
		Tree c4 = new Tree(14);
		Tree c5 = new Tree(15);
		Tree c6 = new Tree(16);

		root.left = c1;
		root.right = c2;
		c1.left = c3;
		c1.right = c4;
		c2.left = c5;
		c2.right = c6;
		
		tree.inOrder(root);

	}
}
