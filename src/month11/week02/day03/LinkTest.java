package month11.week02.day03;

public class LinkTest {
    /*给你一个链表的头节点 head ，判断链表中是否有环。
    * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
    * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 
    * 仅仅是为了标识链表的实际情况。
    * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
    * */
    //双指针解法
    public static boolean hasCycle(Node head){
        Node car=head;
        Node bike=head;
        while(car!=null&&car.next!=null){
            car=car.next.next;
            bike=bike.next;
            if(car==bike){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        Node node1 = new Node(2);
        Node node2 = new Node(0);
        Node node3 = new Node(-4);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;
        boolean result=hasCycle(head);
        System.out.println(result);
    }
}
class Node{
    public int node;
    public Node next;

    public Node(int node) {
        this.node = node;
    }
}
