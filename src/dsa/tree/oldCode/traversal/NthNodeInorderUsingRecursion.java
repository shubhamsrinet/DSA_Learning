package traversal;

import java.util.Scanner;
import traversal.NthNodeInInoeder.Tree;

public class NthNodeInorderUsingRecursion {
	static Tree root;
	static int count = 0;

	private static void inorder(Tree node, int num) {

		if (node == null)
			return;

		if (count <= num) {
			inorder(node.left, num);
			count++;
			if (count == num)
				System.out.print(node.data);
			inorder(node.right, num);
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
