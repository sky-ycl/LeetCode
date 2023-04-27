package month03.week03.day02;

import node.treeNode.TreeNode;

public class Day02_530 {
    TreeNode pre=null;
    int res=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        if(pre!=null){
            res=Math.min(res,root.val-pre.val);
        }
        pre=root;
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(5);
        root.left=node2;
        node2.left=node1;
        node2.right=node3;
        root.right=node4;
        int minimumDifference = new Day02_530().getMinimumDifference(root);

    }
}
