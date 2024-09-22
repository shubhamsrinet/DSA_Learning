package summation;

import java.util.Scanner;
import binaryTreeCreation.Tree;

public class SumOfParentNodeWithChildX {

	static Tree root;
	static int sum;

	private static void findParentSum(Tree root, int number) {
		if (root == null)
			return;
		else if ((root.left != null && root.left.data == number) || (root.right != null && root.right.data == number)) {
			sum = sum + root.data;
		}
		findParentSum(root.left, number);
		findParentSum(root.right, number);

	}

	private static int findSum(Tree root, int number) {
		sum = 0;
		findParentSum(root, number);
		return sum;

	}

	public static void main(String[] args) {
		root = new Tree(4);
		root.left = new Tree(2);
		root.right = new Tree(5);
		root.left.left = new Tree(7);
		root.left.right = new Tree(2);
		root.right.left = new Tree(2);
		root.right.right = new Tree(3);
		Scanner sc = new Scanner(System.in);

		System.out.println("Inter Number to find the SUM ");

		int number = sc.nextInt();

		System.out.println(findSum(root, number));
		sc.close();

	}
}
