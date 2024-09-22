package traversal;

import java.util.Stack;
import binaryTreeCreation.Tree;

public class InorderWithoutRecursion {

	static Tree root;

	private static void inorder(Tree root2) {

		if (root2 == null)
			return;
		Tree node = root2;
		Stack<Tree> stack = new Stack<>();

		while (node != null || stack.size() > 0) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}

			node = stack.pop();
			System.out.print(node.data+" ");
			node = node.right;

		}

	}

	public static void main(String[] args) {
		root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.left.left = new Tree(4);
		root.left.right = new Tree(5);

		inorder(root);

	}

}
