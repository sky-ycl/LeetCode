package month02.week03.day01;

import node.listNode.ListNode;

public class Day01_206 {
    //方法一（迭代）
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
