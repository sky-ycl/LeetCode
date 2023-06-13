package month05.week04.day04;

import node.listNode.ListNode;

/*
定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
*/
public class Day04_Offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null) {
            ListNode node = new ListNode(cur.val);
            node.next=pre;
            pre=node;
            cur=cur.next;
        }
        return pre;
    }
}
