package month01.week01.day05;


import java.util.HashMap;
import java.util.Map;

public class Day05_01 {
    private Map<Integer, Integer> map;

    public TreeNode myBuildTree(int[] preOrder, int[] inorder, int preOrder_left, int preOder_right, int inorder_left, int inorder_right) {
        //递归结束条件
        if (preOrder_left > preOder_right) {
            return null;
        }
        //获取头节点
        int preOrder_root = preOrder_left;
        //在中序中找到头节点的位置
        int inorder_root = map.get(preOrder[preOrder_root]);
        //把根节点建立出来
        TreeNode root = new TreeNode(preOrder[preOrder_root]);
        //得到左子节点的数目
        int size_left_subtree = inorder_root - inorder_left;
        // 递归地构造左子树，并连接到根节点
        root.left = myBuildTree(preOrder, inorder, preOrder_left + 1, preOrder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归地构造右子树，并连接到根节点
        root.right = myBuildTree(preOrder, inorder, preOrder_left + size_left_subtree + 1, preOder_right, inorder_root + 1, inorder_right);
        return root;
    }

    public TreeNode buildTree(int[] preOrder, int[] inorder) {
        //构建哈希表，方便快速定位到节点位置
        map = new HashMap<>();
        //遍历中序数组
        for (int i = 0; i < inorder.length; i++) {
            //通过值来找到值在数组的位置
            map.put(inorder[i], i);
        }
        return myBuildTree(preOrder, inorder, 0, preOrder.length - 1, 0, inorder.length - 1);
    }

    public static void main(String[] args) {
        int[] preOder = new int[]{1, 2, 4, 5, 3, 6, 7};
        int[] inorder = new int[]{4, 2, 5, 1, 6, 3, 7};
        TreeNode root = new Day05_01().buildTree(preOder, inorder);
        System.out.println(root);
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
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}