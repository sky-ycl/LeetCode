package month02.week03.day01;

import java.util.ArrayList;
import java.util.List;

/*给定两个整数 n 和 k，
 [1, n] 中所有可能的 k 个数的组合。
你可以按 任何顺序 返回答案。*/
public class Day01_77 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backTrack(1, n, k);
        return lists;
    }

    public void backTrack(int start, int n, int k) {
        if (list.size() == k) {
            lists.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <=n-(k-list.size())+1; i++) {
            list.add(i);
            backTrack(i + 1, n, k);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> combine = new Day01_77().combine(4, 2);
        System.out.println(combine);
    }
}
