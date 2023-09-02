package month08.week04.day03;

import node.listNode.ListNode;

public class Day03_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode root = new ListNode(0, head);
        ListNode res = root;
        ListNode cur = head;
        ListNode pre = head;
        int count = 0;
        while (cur != null) {
            count++;
            if (count % k == 0) {
                ListNode temp = cur.next;
                cur.next = null;
                ListNode node = reverse(pre);
                res.next = node;
                pre = temp;
                ListNode cur1 = node;
                while (cur1.next != null) {
                    cur1 = cur1.next;
                }
                res = cur1;
                cur = cur1;
                cur.next = temp;
            }
            cur = cur.next;
        }
        return root.next;
    }

    public ListNode reverse(ListNode node) {
        ListNode cur = node;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node = ListNode.build()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5).build();
        ListNode res = new Day03_25().reverseKGroup(node, 2);
        System.out.println(res);
    }
}

