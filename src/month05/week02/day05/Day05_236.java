package month05.week02.day05;

import node.treeNode.TreeNode;

//求最近公共祖先
public class Day05_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }
}
