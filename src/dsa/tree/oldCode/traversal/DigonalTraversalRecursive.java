package traversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import binaryTreeCreation.Tree;

public class DigonalTraversalRecursive {

	static Tree root;

	private static void diagonalPrintMethod(Tree root, int i, HashMap<Integer, ArrayList<Integer>> digonalPrint) {
		if (root == null)
			return;
		ArrayList<Integer> list = digonalPrint.get(i);

		if (list == null) {
			list = new ArrayList<>();
			list.add(root.data);
		} else {
			list.add(root.data);
		}

		digonalPrint.put(i, list);
		diagonalPrintMethod(root.left, i + 1, digonalPrint);
		diagonalPrintMethod(root.right, i, digonalPrint);

	}

	private static void diagonalPrint(Tree root) {
		HashMap<Integer, ArrayList<Integer>> digonalPrint = new HashMap<>();
		diagonalPrintMethod(root, 0, digonalPrint);
		for (Entry<Integer, ArrayList<Integer>> data : digonalPrint.entrySet()) {
			System.out.print(data.getValue());
		}
	}

	public static void main(String[] args) {
		root = new Tree(8);
		root.left = new Tree(3);
		root.right = new Tree(10);
		root.left.left = new Tree(1);
		root.left.right = new Tree(6);
		root.right.right = new Tree(14);
		root.right.right.left = new Tree(13);
		root.left.right.left = new Tree(4);
		root.left.right.right = new Tree(7);

		diagonalPrint(root);

	}

}
