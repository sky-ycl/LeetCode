package month02.week04.day06;

import node.listNode.ListNode;

/*给你一个链表的头节点 head 。
对于列表中的每个节点 node ，如果其右侧存在一个具有 严格更大 值的节点，则移除 node 。
返回修改后链表的头节点 head 。
*/
public class Day06_2487 {
    public ListNode removeNodes(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode next=removeNodes(head.next);
        if(head.val<next.val){
            return next;
        }
        head.next=next;
        return head;
    }
}
