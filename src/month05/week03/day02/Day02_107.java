package month05.week03.day02;

import node.treeNode.TreeNode;

import java.math.BigDecimal;
import java.util.*;

public class Day02_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        List<List<Integer>> lists = bfs(root);
        Collections.reverse(lists);
        return lists;
    }

    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
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
            lists.add(new LinkedList<>(list));
        }
        return lists;
    }

    public static void main(String[] args) {
    }
}
