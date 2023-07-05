package month05.week04.day05;

import node.listNode.ListNode;

public class Day05_Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //获取链表的长度
        int len = 0;
        ListNode cur =  head;
        while ( cur != null){
            len++;
            cur=cur.next;
        }
        cur=head;
        for(int i=0;i<len-k;i++){
            cur=cur.next;
        }
        return cur;
    }
}
