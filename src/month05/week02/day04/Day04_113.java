package month05.week02.day04;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/*
* 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
叶子节点 是指没有子节点的节点。
*/
public class Day04_113 {

    private List<List<Integer>> res = new LinkedList<>();
    private List<Integer> list = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, 0, targetSum);
        return res;
    }

    public void dfs(TreeNode root, int num, int targetSum) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        num += root.val;
        //路径和等于目标和
        if (root.left == null && root.right == null && num == targetSum) {
            res.add(new LinkedList<>(list));
        }
        dfs(root.left, num, targetSum);
        dfs(root.right, num, targetSum);
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(11);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(2);
        root.left = node1;
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        List<List<Integer>> lists = new Day04_113().pathSum(root, 22);
        System.out.println(lists);

    }
}
