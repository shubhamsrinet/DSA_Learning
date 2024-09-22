package test;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	static Tree root;
	
	static class Tree {
		Tree left,right;
		int value;
		Tree(int value){
			this.value = value;
		}
	}
	
	private static void printTree(Tree root) {
		Tree node = root;
		if(node == null)
			return;

			printTree(node.left);
			System.out.print(node.value+" ");
			printTree(node.right);

		
	}
	
	public static void main(String args[]){
		root = new Tree(20);
		root.left = new Tree(100);
		root.right = new Tree(3);
		root.left.left = new Tree(50);
		root.left.right = new Tree(15);
		root.right.left = new Tree(250);
		root.right.right = new Tree(35);
		root.left.left.left = new Tree(222);
		
		System.out.print("Traversal :");
		printTree(root);
		System.out.println();
		levelOrderTraversal(root);
	}

	private static void levelOrderTraversal(Tree root) {
		Queue<Tree> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			
			Tree node = queue.poll();
			System.out.print(node.value+" ");
			if(node.left!=null){
				queue.add(node.left);
			}

			if(node.right!=null){
				queue.add(node.right);
			}


		}
		
	}
	
}
