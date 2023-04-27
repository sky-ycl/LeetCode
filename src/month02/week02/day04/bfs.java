package month02.week02.day04;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
    public List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> lists=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new LinkedList<>();
            int curQueueSize=queue.size();
            for (int i = 0; i < curQueueSize; i++) {
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
}
