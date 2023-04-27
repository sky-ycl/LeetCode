package study.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private int maxSize;
    private List<Integer> stack;

    public Stack() {
        stack=new ArrayList<>();
    }

    public Integer pop() {
        return stack.remove(stack.size() - 1);
    }

    public Integer peek() {
        return stack.get(stack.size() - 1);
    }

    public void push(Integer val) {
        stack.add(val);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(!stack.isEmpty()){
            for (int i = 0; i < stack.size(); i++) {
                if(i==stack.size()-1){
                    sb.append(stack.get(i));
                }else{
                    sb.append(stack.get(i)+",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
