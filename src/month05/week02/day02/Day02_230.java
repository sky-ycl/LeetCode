package month05.week02.day02;

import node.treeNode.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day02_230 {
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        //广度优先遍历
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
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
        Collections.sort(list);
        return list.get(k-1);
    }
}
