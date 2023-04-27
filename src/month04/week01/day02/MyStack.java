package month04.week01.day02;

import java.util.ArrayList;
import java.util.List;

//用队列实现栈
public class MyStack {
    private List<Integer> stack;
    public MyStack() {
        stack=new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public boolean empty() {
        return stack.size()==0;
    }
}
