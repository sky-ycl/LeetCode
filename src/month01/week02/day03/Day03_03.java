package month01.week02.day03;

import java.util.*;

/*
给你二叉树的根结点 root ，请你将它展开为一个单链表：
展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
展开后的单链表应该与二叉树 先序遍历 顺序相同。
*/
public class Day03_03 {
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        int max_depth = -1;
        //创建一个存放节点的栈
        Deque<TreeNode> nodeStack = new LinkedList<>();
        nodeStack.push(root);
        //创建一个存放深度的栈
        Deque<Integer> depthStack = new LinkedList<>();
        depthStack.push(0);
        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();
            if (node != null) {
                //维护二叉树的最大深度
                max_depth = Math.max(max_depth, depth);
                // 如果不存在对应深度的节点我们才插入
                if (!map.containsKey(depth)) {
                    map.put(depth, node.val);
                }
                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }
        }
        List<Integer> list = new LinkedList<>();
        System.out.println(map.size());
        for (int i = 0; i < map.size(); i++) {
            list.add(map.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        root.left = node1;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return +val + "  ";
    }
}