package month02.week04.day06;


import node.listNode.ListNode;

/*给定一个单链表 L 的头节点 head ，单链表 L 表示为：
L0 → L1 → … → Ln - 1 → Ln
请将其重新排列后变为：
L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
*/
public class Day06_143 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode midList = searchMidList(head);
        ListNode L2 = reverserList(midList.next);
        midList.next = null;
        ListNode L1 = head;
        mergeList(L1, L2);
    }

    //找到中间的链表
    public ListNode searchMidList(ListNode head) {
        //通过快慢指针找到中间的指针
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //反转链表
    public ListNode reverserList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    //合并链表
    public void mergeList(ListNode L1, ListNode L2) {
        ListNode L1_next = null;
        ListNode L2_next = null;
        while (L1 != null && L2 != null) {
            L1_next=L1.next;
            L2_next=L2.next;

            L1.next = L2;
            L2.next = L1_next;
            L1 = L1_next;
            L2 = L2_next;

        }
    }
}
/*
*       ListNode l1_tmp;
        ListNode l2_tmp;
        while (l1 != null && l2 != null) {
            l1_tmp = l1.next;
            l2_tmp = l2.next;

            l1.next = l2;
            l1 = l1_tmp;

            l2.next = l1;
            l2 = l2_tmp;
* */