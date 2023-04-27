package month03.week01.day01;

import node.listNode.ListNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 */
public class Day01_148 {
    public ListNode sortList(ListNode head) {
        //链表为空的话
        if (head == null) {
            return null;
        }
        List<Integer> list = new LinkedList<>();
        //得到链表值的集合
        getListVal(head, list);
        //将集合排序（小到大）
        Collections.sort(list);
        ListNode cur = head;
        int index = 0;
        //给链表的值重新赋值
        while (cur != null) {
            cur.val = list.get(index++);
            cur = cur.next;
        }
        return head;
    }

    public List<Integer> getListVal(ListNode head, List listVal) {
        ListNode cur = head;
        while (cur != null) {
            listVal.add(cur.val);
            cur=cur.next;
        }
        return listVal;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode listNode = new Day01_148().sortList(head);
        System.out.println(listNode);

    }
}
