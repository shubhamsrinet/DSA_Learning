package traversal;

import binaryTreeCreation.Tree;

public class LevelOrderTraversal {

	static Tree root;

	public static void inOrder(Tree node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	private static void levelOrder(Tree root) {
		int hight = hightCalculate(root);
		for (int i = 1; i <= hight; i++) {
			printLevelOrder(root, i);
		}
	}

	private static void printLevelOrder(Tree root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printLevelOrder(root.left, level - 1);
			printLevelOrder(root.right, level - 1);
		}
	}

	private static int hightCalculate(Tree root) {
		if (root == null)
			return 0;
		else {
			int lhight = hightCalculate(root.left);
			int rhight = hightCalculate(root.right);

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

		inOrder(root);
		System.out.println();
		levelOrder(root);

	}

}
