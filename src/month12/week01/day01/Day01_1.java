package month12.week01.day01;

public class Day01_1 {
    /*给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，
   并返回 新的头节点
   */
    public static Node removeElements(Node head, int val) {
        if(head==null){
            return head;
        }
        head.next=removeElements(head.next,val);
        if(head.val==val){
            return head.next;
        }else {
            return head;
        }
    }
    public static void main(String[] args) {
        //1,2,6,3,4,5,6
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(6);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        removeElements(head,6);
        System.out.println(head);
    }
}
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return  val + " " + next;
    }
}