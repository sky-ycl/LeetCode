package month05.week02.day02;

import node.treeNode.TreeNode;

//求树的最大直径
public class Day02_543 {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        //求出每个左右节点的最大高度
        int L=dfs(root.left);
        int R=dfs(root.right);
        res=Math.max(L+R,res);
        return Math.max(L,R)+1;
    }
}
