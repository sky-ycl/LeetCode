package month04.week01.day04;

import java.util.Stack;

//栈的压入 和 弹出序列
public class Day04_offer_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        //按照弹出序列的顺序来进行，如果最后栈中还有元素则表示弹出顺序是错误的
        int index=0;
        for (int val : pushed) {
            stack.push(val);
            while(!stack.isEmpty()&&stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
