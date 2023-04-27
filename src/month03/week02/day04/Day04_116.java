package month03.week02.day04;

import node.Node;

public class Day04_116 {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Node pre = root;
        while (pre.left != null) {
            Node tmp = pre;
            while (tmp != null) {
                tmp.left.next = tmp.right;
                if (tmp.next != null) {
                    tmp.right.next = tmp.next.left;
                }
                tmp = tmp.next;
            }
            pre = pre.left;
        }
        return root;
    }
}
