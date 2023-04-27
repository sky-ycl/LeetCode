package month03.week02.day04;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Study {
    public List<List<Integer>> dfs(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        //创建一个队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
                List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        root.left=node1;
        root.right=node2;
        node1.left=node3;
        node1.right=node4;
        node2.left=node5;
        node2.right=node6;
        List<List<Integer>> dfs = new Study().dfs(root);
        System.out.println(dfs);
    }
}
