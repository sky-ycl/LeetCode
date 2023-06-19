package month05.week04.day05;

import node.listNode.ListNode;

public class Day05_Offer25 {
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resNode = new ListNode(0);
        ListNode cur_l1 = l1;
        ListNode cur_l2 = l2;
        //pre是目前resNode遍历的当前节点
        ListNode pre = resNode;
        while (cur_l1 != null && cur_l2 != null) {
            if (cur_l1.val < cur_l2.val) {
                pre.next = cur_l1;
                cur_l1 = cur_l1.next;
            } else {
                pre.next = cur_l2;
                cur_l2 = cur_l2.next;
            }
            pre = pre.next;
        }
        //当l1和l2还有为遍历的节时
        while (cur_l1 != null) {
            pre.next = cur_l1;
            pre = pre.next;
            cur_l1=cur_l1.next;
        }
        while (cur_l2 != null) {
            pre.next = cur_l2;
            pre = pre.next;
            cur_l2=cur_l2.next;
        }
        return resNode.next;
    }
}
