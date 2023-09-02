package month08.week03.day03;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> list = new ArrayList<>();
    private List<Integer> minList = new ArrayList<>();
    private int min;

    public MinStack() {

    }

    public void push(int val) {
        if (minList.size()>0) {
            if (val <= minList.get(minList.size() - 1)) {
                minList.add(val);
            }else{
                minList.add(minList.get(minList.size()-1));
            }
        }else{
            minList.add(val);
        }
        list.add(val);
    }

    public void pop() {
        Integer num = list.remove(list.size() - 1);
        if (num == minList.get(minList.size() - 1)) minList.remove(minList.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}
