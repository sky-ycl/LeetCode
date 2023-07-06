package month07.week01;

import node.treeNode.TreeNode;
import node.treeNode.utils.TreeNodeUtil;

import java.util.*;

/*
给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
*/
public class Day01_Offer54 {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNodeUtil.buildTreeNode();
        int i = new Day01_Offer54().kthLargest(root, 1);
        System.out.println(i);
    }
}
