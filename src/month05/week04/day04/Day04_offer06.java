package month05.week04.day04;

import node.Node;
import node.listNode.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
*/
public class Day04_offer06 {
    public int[] reversePrint(ListNode head) {
        //使用栈
        Deque<ListNode> stack=new LinkedList<>();
        ListNode cur=head;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        int[] node=new int[stack.size()];
        int index=0;
        while(!stack.isEmpty()){
            node[index++]=stack.pop().val;
        }
        return node;
    }
}
