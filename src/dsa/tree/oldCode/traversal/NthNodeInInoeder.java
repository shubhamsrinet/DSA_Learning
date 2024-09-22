package traversal;

import java.util.Scanner;
import java.util.Stack;


public class NthNodeInInoeder {
	
	static public class Tree {
		
		public int data;
		public Tree left,right;
		
		public Tree(int data) {
			this.data = data;
		}
	}

	static Tree root;
	static int count = 0;

	private static void inorder(Tree root2, int num) {

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
			count++;
			if (count == num) {
				System.out.println(node.data);
				break;
			}
			node = node.right;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		root = new Tree(10);
		root.left = new Tree(20);
		root.right = new Tree(30);
		root.left.left = new Tree(40);
		root.left.right = new Tree(50);
		int num = sc.nextInt();
		inorder(root, num);
		sc.close();

	}

}
