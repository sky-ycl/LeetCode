package month03.week02.day03;

import node.treeNode.TreeNode;

public class Day03_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p,q);
    }

    public boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return dfs(p.left, q.left) && dfs(p.right, q.right);
    }
}
