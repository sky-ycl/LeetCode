package month09.week01.day01;

import java.util.ArrayList;
import java.util.List;

public class Day01_131 {
    List<List<String>> lists = new ArrayList<>();
    List<String> list = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backTrack(s, 0, 0);
        return lists;
    }

    public void backTrack(String s, int start, int index) {
        if (start == s.length()) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isLegal(s, index, i)) {
                list.add(s.substring(index, i + 1));
                backTrack(s, i + 1, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isLegal(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> res = new Day01_131().partition("aabcdd");
        System.out.println(res);
    }
}
