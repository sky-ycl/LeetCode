package month05.week01.day05;

import node.listNode.ListNode;

/*
给你一个链表的头节点 head 。删除 链表的 中间节点 ，并返回修改后的链表的头节点 head 。

长度为 n 链表的中间节点是从头数起第 ⌊n / 2⌋ 个节点（下标从 0 开始），其中 ⌊x⌋ 表示小于或等于 x 的最大整数。

对于 n = 1、2、3、4 和 5 的情况，中间节点的下标分别是 0、1、1、2 和 2 。

*/
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
