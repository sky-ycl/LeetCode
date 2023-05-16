package month05.week02.day01;

import node.treeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Day01_98_1 {
    private List<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null || list.size()==1){
            return true;
        }
        dfs(root);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)<=list.get(i-1)){
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode root){
        dfs(root.left);
        list.add(root.val);
        if(list.get(list.size()-1)<=list.get(list.size()-2) ){
            return ;
        }
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        root.left=node1;
        root.right=node2;
        node2.left=node3;
        node2.right=node4;
    }
}
