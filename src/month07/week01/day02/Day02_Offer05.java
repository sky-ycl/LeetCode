package month07.week01.day02;

import node.treeNode.TreeNode;

public class Day02_Offer05 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}
