package month12.week02.day06;

public class Day06_01 {
    public Node deleteDuplicates(Node head) {
        if(head==null){
            return null;
        }
        Node dummy=new Node(0,head);
        Node curNode=dummy;
        while(curNode.next!=null&&curNode.next.next!=null){
            if(curNode.next.val==curNode.next.next.val){
                int val=curNode.next.val;
                while(curNode.next!=null&&curNode.next.val==val){
                    curNode.next=curNode.next.next;
                }
            }else{
                curNode=curNode.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(3);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(4);
        Node node6 = new Node(6);
        Node node7 = new Node(6);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        Node node=new Day06_01().deleteDuplicates(head);
        System.out.println(node);
    }
}
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + " " + next ;
    }
}