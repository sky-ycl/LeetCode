package month05.week02.day02;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day02_044_offer {
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return new LinkedList<>();
        }
        //广度优先遍历
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        //存放每层最大值的集合
        List<Integer> res=new LinkedList<>();
        res.add(root.val);
        while(!queue.isEmpty()){
            int max=Integer.MIN_VALUE;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //寻找每一层的值最大的节点
                TreeNode node = queue.poll();
                max=Math.max(max,node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}
