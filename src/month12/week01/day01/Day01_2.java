package month12.week01.day01;

public class Day01_2 {
    public static ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode pre=reverseList(head);
        System.out.println(pre);
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }


}