package month08.week02.day03;

import node.listNode.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day03_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for (ListNode node : lists) {
            ListNode cur = node;
            while (cur != null) {
                list.add(cur.val);
                cur=cur.next;
            }
        }
        //System.out.println(list);

        // 将集合中得元素进行排序
        Collections.sort(list);
        ListNode head=new ListNode(0);
        ListNode node=head;
        for (Integer val : list) {
            ListNode newNode = new ListNode(val);
            node.next=newNode;
            node=node.next;
        }
        return head.next;
    }
}
