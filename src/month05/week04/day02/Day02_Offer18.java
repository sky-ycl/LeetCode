package month05.week04.day02;

import node.listNode.ListNode;

public class Day02_Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = new ListNode(0, head);
        ListNode pre = node;
        ListNode cur = head;
        while (cur != null) {
            if(val==cur.val){
                pre.next=cur.next;
            }
            pre=cur;
            cur=cur.next;
        }
        return node.next;
    }
}
