package month01.week02.Day05;

public class Day05_02 {
    public void pre(TreeNode node) {
        if (node == null) {
            return;
        }
        pre(node.left);
        pre(node.right);
        if (node.right != null || node.left != null) {
            TreeNode curNode=node.right;
            node.right=node.left;
            node.left=curNode;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        pre(root);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        TreeNode node = new Day05_02().invertTree(root);
        System.out.println(node);

    }
}
