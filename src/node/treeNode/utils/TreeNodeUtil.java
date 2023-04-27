package node.treeNode.utils;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeUtil {
    public static List<Integer> dfs(TreeNode  root){
        List<Integer> list=new LinkedList<>();
        pre(root,list);
        return list;
    }

    public static void  pre(TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        pre(root.left,list);
        pre(root.right,list);
    }

    public static List<List<Integer>> bfs(TreeNode root){
        if(root==null){
            return null;
        }
        //创建一个队列，存放每一深度节点的值
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> lists=new LinkedList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static TreeNode buildTreeNode(){
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        root.left=node1;
        root.right=node2;
        node1.left=node3;
        node1.right=node4;
        node2.left=node5;
        node2.right=node6;
        return root;
    }
}

