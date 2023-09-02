package month08.week03.day04;

import node.listNode.ListNode;

import java.util.*;

public class Day04_LCR78 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;
        int n = lists.length;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ListNode cur = lists[i];
            while (cur != null) {
                list.add(cur.val);
                cur = cur.next;
            }
        }
        // 将集合进行排序
        Collections.sort(list);
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (Integer val : list) {
            cur.next=new ListNode(val);
            cur=cur.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        Deque<Integer> deque=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.sort(list,(o1,o2)->o1.compareTo(o2));
    }
}
