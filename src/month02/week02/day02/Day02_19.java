package month02.week02.day02;

import node.listNode.ListNode;
import node.treeNode.TreeNode;

public class Day02_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lenSum = 0;
        ListNode curNode = head;
        //寻找链表的总长度
        while (curNode != null) {
            curNode=curNode.next;
            lenSum++;
        }
        int curLen = lenSum - n;
        if(curLen==0){
            return head.next;
        }
        ListNode node = head;
        for (int i = 1; i < curLen; i++) {
            node = node.next;
        }
            node.next=node.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode listNode = new Day02_19().removeNthFromEnd(head,5);
        System.out.println(listNode);
    }
}
