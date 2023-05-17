package month05.week02.day02;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Day02_230_1 {
    private List<Integer> list=new LinkedList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return list.get(k-1);
    }

    //因为是二叉搜索树，直接中序遍历
    public void dfs(TreeNode root,int k){
        if(root==null){
            return;
        }
        dfs(root.left,k);
        list.add(root.val);
        //只要集合大小>=k 就说明已经找到了第k小的数
        if(list.size()>=k){
            return;
        }
        dfs(root.right,k);
    }
}
