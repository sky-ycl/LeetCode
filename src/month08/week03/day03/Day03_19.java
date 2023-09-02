package month08.week03.day03;

import node.listNode.ListNode;

public class Day03_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        // 计算链表的长度
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        ListNode node = new ListNode(0, head);
        cur = head;
        ListNode pre = node;
        for (int i = 0; i < len - n ; i++) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return node.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = new Day03_19().removeNthFromEnd(node1, 2);
        System.out.println(node);

        ListNode head = ListNode.build()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .build();
        System.out.println(head);
    }
}
