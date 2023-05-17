package month05.week02.day02;

import node.treeNode.TreeNode;

//求树的最大深度
public class Day02_104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
