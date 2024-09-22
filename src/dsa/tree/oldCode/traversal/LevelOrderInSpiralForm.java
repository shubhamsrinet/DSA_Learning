package traversal;

import binaryTreeCreation.Tree;

public class LevelOrderInSpiralForm {

	static Tree root;

	private static void spiralTraverse(Tree root2) {
		int hight = hight(root2);
		boolean highLow = true;
		for (int i = 1; i <= hight; i++) {
			printTree(root, i, highLow);
			highLow = !highLow;
		}

	}

	private static void printTree(Tree root, int level, boolean highLow) {
		if (root == null)
			return;
		if (level == 1) {
			System.out.print(root.data+" "); 
		} else if (level > 1) {
			if (highLow == false) {
				printTree(root.left, level - 1, highLow);
				printTree(root.right, level - 1, highLow);
			} else {
				printTree(root.right, level - 1, highLow);
				printTree(root.left, level - 1, highLow);
			}
		}

	}

	private static int hight(Tree root) {
		if (root == null)
			return 0;
		else {
			int lhight = hight(root.left);
			int rhight = hight(root.right);

			if (lhight > rhight)
				return lhight + 1;
			else
				return rhight + 1;
		}

	}

	public static void main(String[] args) {
		root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);
		root.right.left = new Tree(6);
		root.right.right = new Tree(7);

		spiralTraverse(root);

	}

}
