package month07.week01.day05;

import node.treeNode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Day05_Offer07 {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 存储中序节点的每个节点的位置
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1, preorder);
    }

    public TreeNode recur(int rootIndex, int left, int right, int[] preorder) {
        //递归结束条件
        if (left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[rootIndex]);
        Integer i = map.get(preorder[rootIndex]);
        // 根据中序遍历找到左右子树
        node.left = recur(rootIndex + 1, left, i - 1, preorder);
        node.right = recur(rootIndex + 1 + i - left, i + 1, right, preorder);
        return node;
    }

    public static void main(String[] args) {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        TreeNode node = new Day05_Offer07().buildTree(preorder, inorder);
        System.out.println(node);
    }
}
