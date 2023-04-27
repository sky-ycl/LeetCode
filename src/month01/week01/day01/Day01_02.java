package month01.week01.day01;

import node.listNode.ListNode;

import java.util.HashSet;
import java.util.Set;

/*
* 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
*/
public class Day01_02 {
    //哈希表
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode curNode=head;
        if(curNode==null){
            return null;
        }
        while(curNode!=null){
            if(set.contains(curNode)){
                return curNode;
            }
            set.add(curNode);
            curNode=curNode.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(4);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;
        ListNode res = new Day01_02().detectCycle(head);
        System.out.println(res.val);
    }
}
