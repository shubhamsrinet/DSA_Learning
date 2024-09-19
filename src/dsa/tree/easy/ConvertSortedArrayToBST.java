package dsa.tree.easy;

import dsa.tree.binaryTree.Tree;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertSortedArrayToBST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        //int k = sc.nextInt();
        Tree root = sortedTOBST(array,0,array.length-1);
        printTree(root);
    }

    private static Tree sortedTOBST(int[] array,int start, int end) {
        if(start>end){
            return null;
        }
        int middle = start + (end-start)/2;
        Tree root = new Tree(array[middle]);
        root.left = sortedTOBST(array,start,middle-1);
        root.right = sortedTOBST(array,middle+1,end);
        return root;
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
