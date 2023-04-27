package month01.week03.Day01;

/*给定二叉树的根节点 root ，返回所有左叶子之和。*/
public class Day01_03 {
    int sumLeft = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sumOfLeftLeaves(root.left);
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sumLeft+=root.left.val;
        }
        sumOfLeftLeaves(root.right);
        return sumLeft;
    }
}
