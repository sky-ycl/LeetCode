package month06.week02.day01;

import node.treeNode.TreeNode;

public class Day01_Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        mirrorTree(root.left);
        mirrorTree(root.right);
        swapNode(root);
        return root;
    }

    public void swapNode(TreeNode root){
        TreeNode tempNode=root.right;
        root.right=root.left;
        root.left=tempNode;
    }
}
