package month08.week03.day02;

import java.util.ArrayList;
import java.util.List;

public class Day02_Offer57 {
    public List<List<Integer>> findContinuousSequence(int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < target; i++) {
            list.add(i);
            sum += i;
            while (sum > target) {
                sum-=list.get(0);
                list.remove(0);
            }
            if(sum==target) lists.add(new ArrayList<>(list));
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new Day02_Offer57().findContinuousSequence(16);
        System.out.println(res);
    }
}
