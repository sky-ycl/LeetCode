package month09.week01.day02;

import java.util.Stack;

public class Day02_32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c=='(') stack.push(i);
            else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    res=Math.max(res,i-stack.peek());
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int res = new Day02_32().longestValidParentheses("()(()");
        System.out.println(res);
    }
}
