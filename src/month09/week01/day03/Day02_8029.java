package month09.week01.day03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day02_8029 {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, (a, b) -> a.get(0) - b.get(0));
        List<List<Integer>> res = new ArrayList<>();
        res.add(nums.get(0));
        int n = nums.size();
        for (int i = 1; i < n; i++) {
            if (nums.get(i).get(0) > res.get(res.size() - 1).get(1)) {
                res.add(nums.get(i));
            } else {
                int num1 = Math.min(res.get(res.size() - 1).get(0), nums.get(i).get(0));
                int num2 = Math.max(res.get(res.size() - 1).get(1), nums.get(i).get(1));
                res.get(res.size() - 1).set(0, num1);
                res.get(res.size() - 1).set(1, num2);
            }
        }
        int count = 0;
        for (List<Integer> list : res) {
            count+=list.get(1)-list.get(0)+1;
        }
        System.out.println(res);
        return count;
    }

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(7);
        nums.add(list1);
        nums.add(list2);
        nums.add(list3);
        System.out.println(nums);
        int i = new Day02_8029().numberOfPoints(nums);
        System.out.println(i);

    }
}
