package month03.week03.day02;

import node.treeNode.TreeNode;
import node.treeNode.utils.TreeNodeUtil;

import java.util.LinkedList;
import java.util.List;

public class Day02_700 {
    private List<TreeNode> list=new LinkedList<>();
    public TreeNode searchBST(TreeNode root, int val) {
        dfs(root,val);
        return list.isEmpty()?null:list.get(0);
    }
    public void dfs(TreeNode root,int val){
        if(root==null){
            return;
        }
        if(root.val==val){
            list.add(root);
            return;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }

    public static void main(String[] args) {
        TreeNode node = TreeNodeUtil.buildTreeNode();
        TreeNode node1 = new Day02_700().searchBST(node, 8);
        System.out.println(node1);

    }
}
