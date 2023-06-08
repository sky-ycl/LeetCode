package month05.week03.day05;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack <T>{
    private LinkedList<T> list=new LinkedList<>();
    private void push(T t){
        list.add(t);
    }

    private void pop(){
        list.remove(list.size()-1);
    }

    private T peek(){
        return list.get(list.size()-1);
    }

    private boolean isEmpty(){
        return list.isEmpty();
    }
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("ls");
        stack.push("zs");
        stack.push("12");
        stack.pop();
        System.out.println(stack.peek());
    }

}
