package month02.week02.day05;

import node.Node;

import java.util.LinkedList;
import java.util.Queue;

/*给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。
如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
初始状态下，所有 next 指针都被设置为 NULL。
*/
public class Day05_116 {
    //广度优先遍历
    public Node connect1(Node root) {
        if (root == null) {
            return null;
        }
        //创建一个队列
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            //取出对头
            for (int i = 0; i < queueSize; i++) {
                Node node = queue.poll();
                if (i < queueSize - 1) {
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node leftmost = root;
        while (leftmost.left != null) {
            Node head = leftmost;
            while (head != null) {
                head.left.next = head.right;
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }
}
