package month03.week02.day04;

import node.Node;

public class Day04_117 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node cur = root;
        while (cur != null) {
            Node dummy = new Node(0);
            Node pre = dummy;
            while (cur != null) {
                if (cur.left != null) {
                    pre.next = cur.left;
                    pre = pre.next;
                }
                if (cur.right != null) {
                    pre.next = cur.right;
                    pre = pre.next;
                }
                cur = cur.next;
            }
            cur=dummy.next;
        }
        return root;
    }
}
