package month04.week02.day02;

import node.listNode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Day02_234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        int left=0,right=list.size()-1;
        while(left<=right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next=node2;
        boolean palindrome = new Day02_234().isPalindrome(node1);
        System.out.println(palindrome);
    }
}
