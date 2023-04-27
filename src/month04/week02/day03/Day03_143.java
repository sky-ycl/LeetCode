package month04.week02.day03;

import node.listNode.ListNode;

import java.util.LinkedList;
import java.util.List;

public class Day03_143 {
    public void reorderList(ListNode head) {
        //创建一个集合，存放节点
        List<ListNode> list = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }
        //左右指针
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            list.get(left).next = list.get(right);
            left++;
            if (left == right) break;
            list.get(right).next = list.get(left);
            right--;
        }
        list.get(right).next = null;
    }
}
