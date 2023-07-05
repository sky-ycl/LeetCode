package month06.week02.day01;

import node.treeNode.TreeNode;

/*
title: 二叉搜索树与双向链表
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。
要求不能创建任何新的节点，只能调整树中节点指针的指向。
*/
public class Day01_Offer36 {
    TreeNode head,pre;
    public TreeNode treeToDoublyList(TreeNode root) {
        if(root==null){
            return null;
        }
        dfs(root);
        head.left=pre;
        pre.right=head;
        return root;
    }

    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        if(pre==null){
            //初始化
            head=root;
        }else{
            root.left=pre;
            pre.right=root;
        }
        pre=root;
        dfs(root.right);
    }
}
