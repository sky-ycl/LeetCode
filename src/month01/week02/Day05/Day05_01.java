package month01.week02.Day05;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*给你二叉树的根节点 root ，返回其节点值的 层序遍历 。
（即逐层地，从左到右访问所有节点）。
*/
public class Day05_01 {
    //队列+树+广度优先遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if(root==null){
            return lists;
        }
        //创建一个队列,存放每一层的节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int curQueueSize = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < curQueueSize; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                //如果左节点不为空的话
                if (node.left != null) {
                    queue.offer(node.left);
                }
                //如果右节点不为空的话
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println(list.size());
    }
}
