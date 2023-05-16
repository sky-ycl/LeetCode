package month05.week02.day01;

import node.listNode.ListNode;

import java.util.*;

public class Day01_148 {
    public ListNode sortList(ListNode head) {
        //结束条件
        if(head==null || head.next==null){
            return head;
        }
        //找到中间链表
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode tmp=slow.next;
        slow.next=null;
        ListNode left =  sortList(head);
        ListNode right = sortList(tmp);
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (left != null && right != null) {
            if(left.val<right.val){
                cur.next=left;
                left=left.next;
            }else{
                cur.next=right;
                right=right.next;
            }
            cur=cur.next;
        }
        //左边链表不为空的话
        while(left!=null){
            cur.next=left;
            left=left.next;
            cur=cur.next;
        }
        //右边链表不为空的化
        while (right!=null){
            cur.next=right;
            right=right.next;
            cur=cur.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode node = new Day01_148().sortList(head);
        System.out.println(node);
    }
}
