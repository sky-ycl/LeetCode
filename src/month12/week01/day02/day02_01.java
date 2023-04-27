package month12.week01.day02;


public class day02_01 {
    /*
    * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。
    * 返回 已排序的链表 。*/
    public static  ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode cur=head;
            while(cur!=null && cur.next!=null){
                while(cur.val==cur.next.val){
                    cur.next=cur.next.next;
                    if(cur.next==null){
                        break;
                    }
                }
                    cur=cur.next;
            }
            return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(3);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode p=deleteDuplicates(head);
        System.out.println(p);

    }
}
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val + " " + next;
    }
}