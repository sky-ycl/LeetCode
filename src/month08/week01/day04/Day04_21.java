package month08.week01.day04;

import node.listNode.ListNode;

public class Day04_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 创建一个新的链表
        ListNode newNode = new ListNode(0);
        ListNode cur=newNode;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                cur.next = p1;
                p1 = p1.next;
            } else {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if(p1==null) cur.next=p2;
        if(p2==null) cur.next=p1;
        return newNode.next;
    }
}
