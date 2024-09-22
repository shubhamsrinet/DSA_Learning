package find;

import binaryTreeCreation.Tree;

public class RootToLeafPath {

	static Tree root;

	private static void printPath(Tree root) {
		int depthOfTree = getMaxDepth(root);
		int array[] = new int[depthOfTree];
		rootToLeafPath(root, array, 0);

	}

	private static int getMaxDepth(Tree root) {
		if (root == null)
			return 0;
		else {
			int lHight = getMaxDepth(root.left);
			int rHight = getMaxDepth(root.right);
			if (lHight > rHight)
				return lHight + 1;
			else
				return rHight + 1;
		}
	}

	private static void rootToLeafPath(Tree root, int[] array, int count) {
		if (root == null)
			return;
		array[count] = root.data;
		count++;

		if (root.left == null && root.right == null) {
			printData(array, count);
		}
		rootToLeafPath(root.left, array, count);
		rootToLeafPath(root.right, array, count);
	}

	private static void printData(int[] array, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
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
		printPath(root);
	}

}
