package month08.week02.day03;

import node.listNode.ListNode;

import java.util.PriorityQueue;

public class Day03_128_1 {
    public ListNode mergeKLists(ListNode[] lists) {
        // 创建优先队列
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (ListNode node : lists) {
            ListNode cur = node;
            while (cur != null) {
                queue.offer(cur.val);
                cur = cur.next;
            }
        }

        ListNode head = new ListNode(0);
        ListNode node = head;
        while(!queue.isEmpty()){
            ListNode newNode = new ListNode(queue.poll());
            node.next=newNode;
            node=node.next;
        }
        return head.next;
    }
}
