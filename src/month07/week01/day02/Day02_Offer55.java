package month07.week01.day02;

import node.treeNode.TreeNode;

public class Day02_Offer55 {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    /*
     返回左右子树的高度 如果左右子树的高度绝对值差<2 就返回左右子树最大高度 否则返回1
    */
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = dfs(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfs(root.right);
        if (rightHeight == -1) return -1;
        return Math.abs(leftHeight - rightHeight) < 2 ? Math.max(leftHeight, rightHeight)+1  : -1;
    }
}
