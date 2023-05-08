package month05.week01.day05;

import node.listNode.ListNode;

public class Day05_2095 {
    public ListNode deleteMiddle(ListNode head) {
        //获取链表长度
        int len=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
        int mid=len/2;
        if(len==1){
            return null;
        }
        ListNode pre=head;
        cur=head.next;
        //因为是从head的next节点开始的，所以要mid-1
        for(int i=0;i<mid-1;i++){
            pre=cur;
            cur=cur.next;
        }
        pre.next=cur.next;
        return head;
    }
}
