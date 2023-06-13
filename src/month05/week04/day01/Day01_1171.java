package month05.week04.day01;

import node.listNode.ListNode;

import java.util.HashMap;
import java.util.Map;

/*
给你一个链表的头节点head，请你编写代码，反复删去链表中由 总和值为 0 的连续节点组成的序列，直到不存在这样的序列为止。
删除完毕后，请你返回最终结果链表的头节点。
*/
public class Day01_1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        //创建一个map集合，key为前缀和 value为当前节点
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        while (cur != null) {
            sum += cur.val;
            map.put(sum, cur);
            cur = cur.next;
        }
        sum = 0;
        cur = dummy;
        while (cur != null) {
            sum+=cur.val;
            cur.next=map.get(sum).next;
            cur=cur.next;
        }
        return dummy.next;
    }
}
