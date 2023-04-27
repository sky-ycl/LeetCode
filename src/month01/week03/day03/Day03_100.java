package month01.week03.day03;

import java.util.LinkedList;
import java.util.List;
/*给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。*/
public class Day03_100 {
    //深度优先遍历
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        p.left = node1;
        p.right = node2;
        TreeNode q = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        q.left = node3;
        q.right = node4;
        boolean res = new Day03_100().isSameTree(p, q);
        System.out.println(res);
    }
}

