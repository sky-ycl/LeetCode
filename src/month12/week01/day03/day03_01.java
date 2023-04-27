package month12.week01.day03;

//前序遍历
public class day03_01 {
    public static void pre(TreeNode node){
        if(node!=null){
            node.pre(node);
        }else{
            System.out.println("这是一盒空二叉树");
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left=node1;
        root.right=node2;
        node1.right=node3;
        node2.left=node4;
        pre(root);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
    public void pre(TreeNode node){
        System.out.println(node);
        if(node.left!=null){
             pre(node.left);
        }
        if(node.right!=null){
             pre(node.right);
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}