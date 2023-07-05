package month06.week02.day01;

import node.treeNode.TreeNode;

/**
 title: 对称的二叉树
*/
public class Day01_Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return recur(root.left,root.right);
    }

    public boolean recur(TreeNode L,TreeNode R){
        if(L==null && R==null){
            return true;
        }
        if(L==null || R==null || L.val!=R.val){
            return false;
        }
        return recur(L.left,R.right) && recur(L.right,R.left);
    }
}
