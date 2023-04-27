package month11.week01.day3;

public class Node {
    int  node;
    Node next;

    public Node() {
    }

    public Node(int node) {
        this.node = node;
    }

    public Node(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "node=" + node + "\n"+next;
    }

    public Node mergeTwoLists(Node node1, Node node2){
        if(node1==null){
            return node2;
        }else if(node2==null){
            return node1;
        }else if(node1.node<node2.node){
            node1.next=mergeTwoLists(node1.next,node2);
            return node1;
        }else {
            node2.next=mergeTwoLists(node1,node2.next);
            return node2;
        }
    }

    public static void main(String[] args) {
        Node node1_1 = new Node(1);
        Node node1_2 = new Node(2);
        Node node1_3 = new Node(3);
        Node node1_4 = new Node(6);
        node1_1.next=node1_2;
        node1_2.next=node1_3;
        node1_3.next=node1_4;
        Node node2_1 = new Node(1);
        Node node2_2 = new Node(3);
        Node node2_3 = new Node(4);
        Node node2_4 = new Node(5);
        node2_1.next=node2_2;
        node2_2.next=node2_3;
        node2_3.next=node2_4;
        Node node=new Node();
        Node p=node.mergeTwoLists(node1_1,node2_1);
        System.out.println(p);
    }

}
