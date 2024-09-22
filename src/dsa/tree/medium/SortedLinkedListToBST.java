package dsa.tree.medium;

import dsa.linkedList.ListNode;
import dsa.tree.binaryTree.Tree;


public class SortedLinkedListToBST {

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        Tree tree = createBST(head,null);
        printTree(tree);
    }

    private static Tree createBST(ListNode start , ListNode end) {
        if(start == end){
            return null;
        }
        ListNode slow = start;
        ListNode fast = start;
        while(fast != end && fast.next != end){
                slow = slow.next;
                fast = fast.next.next;
        }
        Tree root = new Tree(slow.value);
        root.left = createBST(start,slow);
        root.right = createBST(slow.next,end);
        return root;
    }

    public static void printTree(Tree root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        printTree(root.right);
        System.out.print(root.data + " ");

    }
}
