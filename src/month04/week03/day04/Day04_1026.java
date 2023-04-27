package month04.week03.day04;

import node.treeNode.TreeNode;

public class Day04_1026 {

    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode root,int max,int min){
        if(root==null){
            return max-min;
        }
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        return Math.max(dfs(root.left,max,min),dfs(root.right,max,min));
    }
}
