package month05.week02.day03;

import node.treeNode.TreeNode;

public class Day03_129 {
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int num){
        if(root==null){
            return 0;
        }
        num=num*10+root.val;
        if(root.left==null && root.right==null){
           return num;
        }
        return dfs(root.left,num)+dfs(root.right,num);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left=node1;
        root.right=node2;
        int res = new Day03_129().sumNumbers(root);
        System.out.println(res);
    }
}
