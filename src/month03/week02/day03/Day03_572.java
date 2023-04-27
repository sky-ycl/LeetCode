package month03.week02.day03;

import node.treeNode.TreeNode;

public class Day03_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }

    public boolean dfs(TreeNode root,TreeNode subRoot) {
        if(root==null){
            return false;
        }
        return check(root,subRoot) || dfs(root.left,subRoot) || dfs(root.right,subRoot);
    }

    public boolean check(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null || root.val != subRoot.val) {
            return false;
        }
        return check(root.left, subRoot.left) && check(root.right, subRoot.right);

    }
}
