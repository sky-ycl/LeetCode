package month01.week03.day03;

public class Day03_101 {
    public boolean cheek(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return q.val == p.val && cheek(p.left, q.right) && cheek(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return cheek(root, root);

    }
}
