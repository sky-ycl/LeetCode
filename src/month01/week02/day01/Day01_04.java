package month01.week02.day01;

import java.util.Deque;
import java.util.LinkedList;
/*给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
在 S 上反复执行重复项删除操作，直到无法继续删除。*/
public class Day01_04 {
    //自己构建一个栈
    public String removeDuplicates1(String s) {
        StringBuffer stack = new StringBuffer();
        int len = s.length();
        int top = -1;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (top > 0 && stack.charAt(top) == stack.charAt(i)) {
                stack.deleteCharAt(top);
                top--;
            } else {
                stack.append(c);
                top++;
            }
        }
        return stack.toString();
    }

    //使用Deque方法
    public String removeDuplicates(String s) {
        Deque<String> stack = new LinkedList<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty() || !s.substring(i, i + 1).equals(stack.peek())) {
                stack.push(s.substring(i, i + 1));
            } else {
                stack.pop();
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!stack.isEmpty()) {
            stringBuffer.append(stack.peek());
            stack.pop();
        }
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        String s1 = new Day01_04().removeDuplicates(s);
        System.out.println(s1);
        Deque<String> stack = new LinkedList<>();
        stack.push("a");
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.deleteCharAt(1);
        System.out.println(stringBuffer);
    }
}
