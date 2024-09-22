package find;

import binaryTreeCreation.Tree;

public class InvertTree {

	static Tree root;
	static Tree temp;
	
	private static Tree invertTree(Tree root) {
		if(root == null)
			return root;
		
		
        invertTree(root.left);
		invertTree(root.right);	
		
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		return root;
	}
	
	private static void inorder(Tree newRoot) {
		if(newRoot == null)
			return;
		else
		{
			inorder(newRoot.left);
			System.out.print(newRoot.data+" ");
			inorder(newRoot.right);
		}	
	}

	
	public static void main(String[] args) {
		root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		
		inorder(root);
		System.out.println();
	    Tree newRoot = invertTree(root);
	    
	    inorder(newRoot);
		
	}


}
