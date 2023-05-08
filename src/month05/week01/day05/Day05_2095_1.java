package month05.week01.day05;

import node.listNode.ListNode;

public class Day05_2095_1 {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode preHead = new ListNode(0,head);
        //快慢指针
        //快指针一下两个 慢指针一次一个
        ListNode fast=head;
        ListNode slaw=head;
        ListNode pre=preHead;
        while(fast!=null && fast.next!=null){
            pre=slaw;
            slaw=slaw.next;
            fast=fast.next.next;
        }
        pre.next=slaw.next;
        return head;
    }
}
