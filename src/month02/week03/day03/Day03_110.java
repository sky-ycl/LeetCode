package month02.week03.day03;

import node.treeNode.TreeNode;

public class Day03_110 {
    boolean result=true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return result;
    }

    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            result=false;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
