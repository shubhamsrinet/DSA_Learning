package traversal;

import java.util.LinkedList;
import java.util.Queue;
import binaryTreeCreation.Tree;


public class LevelOrderUsingQueue {

	static Tree root;
	
	private static void printLevelOrder() {
	 
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Tree node = queue.poll();
			System.out.print(node.data+" ");
			
			if(node.left!=null)
				queue.add(node.left);
			if(node.right!=null)
				queue.add(node.right);
					
		}		
	}

	
	public static void main(String[] args) {
		
		root = new Tree(1); 
        root.left = new Tree(2); 
        root.right = new Tree(3); 
        root.left.left = new Tree(4); 
        root.left.right = new Tree(5);
        root.left.right.right = new Tree(10);
        root.left.left.right = new Tree(11);
        root.right.right = new Tree(15);
        
        printLevelOrder();
		

	}
}
