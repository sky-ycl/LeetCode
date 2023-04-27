package study.tree;

public class Tree {
    private TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }
    //前序定义
    public void pre(){
        if(this.root!=null){
            this.root.pre();
        }else{
            System.out.println("这是一个空二叉树");
        }
    }
    //中序定义
    public void infix(){
        if(this.root!=null){
            this.root.infix();
        }else{
            System.out.println("这是一个空二叉树");
        }
    }
    //后序定义
    public void postOrder(){
        if(this.root!=null){
            this.root.postOder();
        }else{
            System.out.println("这是一个空二叉树");
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(7);
        TreeNode treeNode7 = new TreeNode(8);
        root.left=treeNode1;
        root.right=treeNode2;
        treeNode1.left=treeNode3;
        treeNode1.right=treeNode4;
        treeNode2.left=treeNode5;
        treeNode2.right=treeNode6;
        treeNode3.left=treeNode7;
        Tree tree = new Tree(root);
        //前序查询
        System.out.print("前序：");
        tree.pre();
        System.out.println();
        //中序查询
        System.out.print("中序：");
        tree.infix();
        System.out.println();
        //后序查询
        System.out.print("后序：");
        tree.postOrder();
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
    //前序遍历
    public void pre(){
        System.out.print(this);
        if(this.left!=null){
            this.left.pre();
        }
        if(this.right!=null){
            this.right.pre();
        }
    }
    //中序遍历
    public void infix(){
        if(this.left!=null){
            this.left.infix();
        }
        System.out.print(this);
        if(this.right!=null){
            this.right.infix();
        }
    }
    //后序遍历
    public void postOder(){
        if(this.left!=null){
            this.left.postOder();
        }
        if(this.right!=null){
            this.right.postOder();
        }
        System.out.print(this);
    }
    @Override
    public String toString() {
        return +val+" ";
    }
}