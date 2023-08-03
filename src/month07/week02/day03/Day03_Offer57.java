package month07.week02.day03;

import java.util.LinkedList;
import java.util.List;

public class Day03_Offer57 {
    private List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> findContinuousSequence(int target) {
        List<Integer> list = new LinkedList<>();
        int sum = 0;
        for (int i = 1; i < target; i++) {
            list.add(i);
            sum += i;
            if (list.get(0) >= target) {
                break;
            }
            while (list.size() >= 2 && sum >= target) {
                if (sum == target) lists.add(new LinkedList<>(list));
                sum -= list.get(0);
                list.remove(0);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
    }
}
