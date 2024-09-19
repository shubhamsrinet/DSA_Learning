package dsa.tree.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class CreateTreeUsingLevelOrder {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Tree root = new Tree(10);
        preOrder(root,list);
        //1,2,4,5,3,6,7
    }

    private static void preOrder(Tree root, List<Integer> list) {
        if(root==null)
            return;
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

}
