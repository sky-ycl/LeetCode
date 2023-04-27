package month01.week01.day01;


import node.listNode.ListNode;

/*
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
 * 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）
 * */
public class Day01_01 {
    public ListNode swapPairs(ListNode head) {
        ListNode curNode = head;
        if (curNode == null || curNode.next == null) {
            return curNode;
        }
        ListNode newNode = curNode.next;
        curNode.next = swapPairs(curNode.next.next);
        newNode.next = curNode;
        return newNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = new Day01_01().swapPairs(head);
        System.out.println(node);

    }
}


