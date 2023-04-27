package month01.week05.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Day05_40 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int sum = 0;

    public void backStack(int[] candidates, int index, int target) {
        if (sum == target) {
            if (!lists.contains(list)) {
                lists.add(new LinkedList<>(list));
                return;

            }
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum <= target) {
                list.add(candidates[i]);
                sum = sum + list.get(list.size() - 1);
                backStack(candidates, i + 1, target);
                sum = sum - list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }else{
                break;
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null) {
            return lists;
        }
        Arrays.sort(candidates);
        backStack(candidates, 0, target);
        return lists;
    }

    public static void main(String[] args) {
        int[] candidates = {1, 2, 2, 3};
        int target = 5;
        List<List<Integer>> lists = new Day05_40().combinationSum2(candidates, 5);
        System.out.println(lists);
    }
}
