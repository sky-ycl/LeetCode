package month01.week02.day04;

/*给定一个二叉树，找出其最大深度。
二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。*/
public class Day04_03 {
    public int maxDepth(TreeNode root) {
        //递归结束条件或者根节点为null
        if(root==null){
            return 0;
        }
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
