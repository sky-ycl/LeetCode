package month05.week02.day04;

import node.treeNode.TreeNode;

public class Day04_112 {
    boolean res = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum,0);
        return res;
    }

    public void dfs(TreeNode root, int targetSum, int num) {
        if (root == null) {
            return;
        }
        num += root.val;
        if (root.left == null && root.right == null && num == targetSum) {
            res=true;
        }
        dfs(root.left,targetSum,num);
        dfs(root.right,targetSum,num);
    }
}
