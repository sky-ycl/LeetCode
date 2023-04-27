package month04.week01.day02;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> queue;
    public MyQueue() {
        queue=new ArrayList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return queue.remove(0);
    }

    public int peek() {
        return queue.get(0);
    }

    public boolean empty() {
        return queue.size()==0;
    }
}
