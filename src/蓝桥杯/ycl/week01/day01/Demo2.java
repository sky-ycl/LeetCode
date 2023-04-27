package 蓝桥杯.ycl.week01.day01;

import node.treeNode.NodeUtil;
import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        NodeUtil nodeUtil = new NodeUtil();
        TreeNode root = nodeUtil.getNode();
        List<List<Integer>> lists = bfs(root);
        int maxSum=0;
        int index=0;
        int sum=0;
        for(int i=0;i<lists.size();i++){
            for(int j=0;j<lists.get(i).size();j++){
                sum+=lists.get(i).get(j);
            }
            if(sum>maxSum){
                index=i+1;
            }
        }
        System.out.println(index);
    }

    public static List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> lists=new LinkedList<>();
        //创建一个队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            //存放每个深度元素的值
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //弹出队头元素
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
