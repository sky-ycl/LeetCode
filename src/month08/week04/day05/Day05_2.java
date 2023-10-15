package month08.week04.day05;

import java.util.ArrayList;
import java.util.List;

public class Day05_2 {
    public static void main(String[] args) {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] nums={4,2,6};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                list.add(nums[j]);
                lists.add(new ArrayList<>(list));
            }
            list.clear();
        }
        System.out.println(lists);
    }
}
