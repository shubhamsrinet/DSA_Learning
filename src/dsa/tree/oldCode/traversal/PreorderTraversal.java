package traversal;

import binaryTreeCreation.Tree;

public class PreorderTraversal {

	static Tree root;
	
	private static void preorder(Tree node)
	{
		if(node==null)
			return;
		preorder(node.left);
		preorder(node.right);
		System.out.print(node.data+" ");
	}
	public static void main(String[] args) {
		root = new Tree(10); 
        root.left = new Tree(11); 
        root.left.left = new Tree(7); 
        root.right = new Tree(9); 
        root.right.left = new Tree(15); 
        root.right.right = new Tree(8); 
        
        preorder(root);

	}
}
