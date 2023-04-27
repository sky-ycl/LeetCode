package month03.week02.day04;

import node.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Day04_117_1 {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            Node pre=null;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if(pre!=null){
                    pre.next=node;
                }
                pre=node;
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return root;
    }
}
