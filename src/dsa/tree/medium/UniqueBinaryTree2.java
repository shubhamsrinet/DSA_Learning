package dsa.tree.medium;

import dsa.tree.binaryTree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueBinaryTree2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Tree> list = uniqueTree2(1,n);
        for(Tree node : list){
            printTree(node);
            System.out.println();
        }
        sc.close();
    }

    private static List<Tree> uniqueTree2(int start, int end) {

            List<Tree> allTrees = new ArrayList<>();
             if(start > end){
                 allTrees.add(null);
                 return allTrees;
             }

            for (int i = start; i <= end; i++) {
                // Generate all possible left subtrees
                List<Tree> leftSubtrees = uniqueTree2(start, i - 1);
                // Generate all possible right subtrees
                List<Tree> rightSubtrees = uniqueTree2(i + 1, end);

                // Combine each left and right subtree with the current root
                for (Tree left : leftSubtrees) {
                    for (Tree right : rightSubtrees) {
                        Tree currentRoot = new Tree(i);
                        currentRoot.left = left;
                        currentRoot.right = right;
                        allTrees.add(currentRoot);
                    }
                }
            }

            return allTrees;
    }

    private static void printTree(Tree root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }
}





//The problem is solved using a recursive approach. For each number in the range 1 to n, we consider it as the root of the BST.
//For each root, we recursively generate all possible left and right subtrees.
//We then combine each left subtree with each right subtree to form complete BSTs.
//Base Case:
//
//If the start value is greater than the end value, it means there are no numbers to form a tree, so we return a list containing null.
//Recursive Case:
//
//For each number i in the range start to end, we consider i as the root of the BST.
//We recursively generate all possible left subtrees using the numbers from start to i-1.
//We recursively generate all possible right subtrees using the numbers from i+1 to end.
//We then combine each left subtree with each right subtree and the current root to form complete BSTs.
