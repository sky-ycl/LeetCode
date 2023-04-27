package month01.week02.day02;

import java.util.*;

/*
* 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
1.左括号必须用相同类型的右括号闭合。
2.左括号必须以正确的顺序闭合。
3.每个右括号都有一个对应的相同类型的左括号。
*/
public class Day02_03 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({[]})";
        String str1 = "abc";
        boolean res = new Day02_03().isValid(str);
        System.out.println(res);
        /*Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.remove(3);
        System.out.println(queue.peek());*/
        Deque<Integer> stacks = new LinkedList<>();
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.pop();
        stacks.pop();
        System.out.println(stacks.isEmpty());
        System.out.println(stacks.peek());
    }
}
