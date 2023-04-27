package month03.week03.day01;

import node.treeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Day01_513 {
    public int findBottomLeftValue(TreeNode root) {
        int res = bfs(root);
        return res;
    }

    public int  bfs(TreeNode root){
        if(root.left==null && root.right==null){
            return root.val;
        }
        int res=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(i==0){
                    res=node.val;
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return res;
    }
}
