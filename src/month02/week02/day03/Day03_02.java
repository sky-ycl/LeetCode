package month02.week02.day03;

import month12.week02.day02.Day02_3;
import node.listNode.ListNode;

/*给你两个 非空 的链表，表示两个非负的整数。
它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储一位数字。
请你将两个数相加，并以相同形式返回一个表示和的链表。
你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
*/
public class Day03_02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = getNum(l1);
        int num2 = getNum(l2);
        int numSum = num1 + num2;
        if(numSum==0){
            return new ListNode(0);
        }
        ListNode node = getListNode(numSum);
        return node;

    }

    public ListNode getListNode(int num) {
        if (num == 0) {
            return null;
        }
        ListNode node = new ListNode();
        node.val = (num % 10);
        num = num / 10;
        node.next = getListNode(num);
        return node;
    }

    public int getNum(ListNode node) {
        if (node == null) {
            return 0;
        }
        return getNum(node.next) * 10 + node.val;
    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(4);
        ListNode node1 = new ListNode(3, node2);
        ListNode node = new ListNode(2, node1);
        ListNode head = new ListNode(1, node);

        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(2, node4);
        ListNode head1 = new ListNode(1, node3);

        int num = new Day03_02().getNum(head);
        int num1 = new Day03_02().getNum(head1);
        System.out.println(num);
        System.out.println(num1);

        ListNode listNode = new Day03_02().addTwoNumbers(head, head1);
        System.out.println(listNode);
    }
}
