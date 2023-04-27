package month04.week02.day02;

import node.listNode.ListNode;

public class Day02_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        ListNode tmp = null;
        ListNode node = new ListNode(0,head);
        ListNode pre=node;
        while (cur != null && cur.next != null) {
            tmp=cur.next;
            cur.next=tmp.next;
            pre.next=tmp;
            tmp.next=cur;
            pre=cur;
            cur=cur.next;
        }
        return node.next;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode node = new Day02_24().swapPairs(node1);
        System.out.println(node);
    }
}
