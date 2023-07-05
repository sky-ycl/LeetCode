package month06.week01.day02;

import node.treeNode.TreeNode;
import node.treeNode.utils.TreeNodeUtil;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
请实现一个函数按照之字形顺序打印二叉树，
即第一行按照从左到右的顺序打印，
第二层按照从右到左的顺序打印，
第三行再按照从左到右的顺序打印，其他行以此类推。


*/
public class Day02_Offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new LinkedList<>();
        }
        List<List<Integer>> list=new LinkedList<>();
        //广度优先遍历
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int height=1;
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
            if(height%2==0){
                reverse(list1);
            }
            list.add(list1);
            height++;
        }
        return list;
    }

    public void reverse(List<Integer> list){
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int temp=list.get(right);
            list.set(right,list.get(left));
            list.set(left,temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        TreeNode node = TreeNodeUtil.buildTreeNode();
        List<List<Integer>> lists = new Day02_Offer32_2().levelOrder(node);
        System.out.println(lists);
    }
}
