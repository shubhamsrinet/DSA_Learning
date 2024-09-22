package find;

import binaryTreeCreation.Tree;

public class MaximumDepth {
 
	static Tree root;
	
	private static int maxHight(Tree root) {
		
		if(root==null)
			return 0;
		else
		{
			int lHight = maxHight(root.left);
			int rHight = maxHight(root.right);
			if(lHight>rHight)
				return lHight+1;
			else
				return rHight+1;
		}
	}

	public static void main(String[] args) {
		root = new Tree(3);
		root.left = new Tree(1);
		root.right = new Tree(7);
		root.right.left = new Tree(5);
		root.right.left.left = new Tree(4);
		
		System.out.println(maxHight(root)-1);

	}
}
