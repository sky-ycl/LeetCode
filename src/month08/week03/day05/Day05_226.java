package month08.week03.day05;

import node.treeNode.TreeNode;

public class Day05_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public void swap(TreeNode root) {
        if (root.left == null && root.right == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode temp = right;
        right = left;
        left = temp;
        root.left=left;
        root.right=right;
    }
}
