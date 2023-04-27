package month02.week02.day02;

import node.listNode.ListNode;

public class Day02_876 {
    public ListNode middleNode(ListNode head) {
        ListNode curNode=head;
        int len=0;
        while(curNode!=null){
            curNode=curNode.next;
            len++;
        }
        int mid=(len/2)+1;
        ListNode searchNode=head;
        for(int i=1;i<mid;i++){
            searchNode=searchNode.next;
        }
        return searchNode;
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
        ListNode listNode = new Day02_876().middleNode(head);
        System.out.println(listNode);
    }
}
