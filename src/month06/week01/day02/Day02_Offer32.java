package month06.week01.day02;

import node.treeNode.TreeNode;
import node.treeNode.utils.TreeNodeUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 */
public class Day02_Offer32 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        List<Integer> list=new LinkedList<>();
        //广度优先遍历
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i);
        }
        return res;
    }
    public List<List<Integer>> levelOrder1(TreeNode root) {
        if(root==null){
            return new LinkedList<>();
        }
        List<List<Integer>> list=new LinkedList<>();
        //广度优先遍历
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list1=new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list1.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            list.add(list1);
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode node = TreeNodeUtil.buildTreeNode();
        int[] res = new Day02_Offer32().levelOrder(node);
        System.out.println(Arrays.toString(res));
    }
}
