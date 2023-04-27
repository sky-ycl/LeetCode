package month03.week01.day03;

import node.listNode.ListNode;

/*
 * */
public class Day03_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode head1 = new ListNode(0, head);
        ListNode cur = head1;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int preVal = cur.next.val;
                while (cur.next != null && cur.next.val == preVal) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return head1.next;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(3, node2);
        ListNode node = new ListNode(2, node1);
        ListNode head = new ListNode(1, node);
        ListNode listNode = new Day03_82().deleteDuplicates(head);
        System.out.println(listNode);
    }
}
