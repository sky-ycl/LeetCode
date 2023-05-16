package month05.week02.day01;

import node.treeNode.TreeNode;

public class Day01_98_2 {
    long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if(pre>= root.val){
            return false;
        }
        pre= root.val;
        return isValidBST(root.right);
    }
}
