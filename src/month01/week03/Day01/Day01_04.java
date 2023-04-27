package month01.week03.Day01;

import java.util.LinkedList;
import java.util.Queue;

/*给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
假设二叉树中至少有一个节点。*/
public class Day01_04 {
    int maxHeight=0;
    int val=0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return val;
    }
    public void dfs(TreeNode root,int curHeight){
        if(root==null){
            return ;
        }
        curHeight++;
        dfs(root.left,curHeight);
        dfs(root.right,curHeight);
        if(maxHeight<curHeight){
            maxHeight=curHeight;
            val=root.val;
        }
    }
    public int findBottomLeftValue1(TreeNode root) {
        // 思路1:层次（从左到右）遍历，记录每行的第一个
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Integer ans = null;
        while (!queue.isEmpty()) {
            ans = null;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (ans == null) ans = node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node5.right=node7;
        int bottomLeftValue = new Day01_04().findBottomLeftValue1(root);
        System.out.println(bottomLeftValue);
    }
}
