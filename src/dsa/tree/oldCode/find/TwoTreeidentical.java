package find;

import binaryTreeCreation.Tree;

public class TwoTreeidentical {
	
	static Tree root1,root2;
	
	private static boolean identicalTree(Tree root1, Tree root2) {
		if(root1 == null && root2 == null)
		return true;
		else if(root1 != null && root2 != null)
		{
			if(root1.data == root2.data 
					&& identicalTree(root1.left, root2.left) 
					&& identicalTree(root1.right, root2.right))
				return true;
			else
				return false;
		}
		else
			return false;
	}


	public static void main(String[] args) {
		root1 = new Tree(10);
		root1.left = new Tree(11);
		root1.right = new Tree(12);
		root1.left.left = new Tree(13);
		root1.left.right = new Tree(14);
		
		root2 = new Tree(10);
		root2.left = new Tree(11);
		root2.right = new Tree(12);
		root2.left.left = new Tree(13);
		root2.left.right = new Tree(14);
		
		if(identicalTree(root1,root2))
			System.out.println("YES");
		else
			System.out.println("NO");
		

	}

}
