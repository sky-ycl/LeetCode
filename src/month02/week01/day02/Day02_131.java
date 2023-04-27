package month02.week01.day02;

import java.util.ArrayList;
import java.util.List;

/*给你一个字符串 s，请你将 s 分割成一些子串，
使每个子串都是 回文串 。返回 s 所有可能的分割方案。
回文串 是正着读和反着读都一样的字符串。*/
public class Day02_131 {
    List<List<String>> lists = new ArrayList<>();
    List<String> list = new ArrayList<>();

    public List<List<String>> partition(String s) {
        if (s.length() == 0) {
            return lists;
        }
        backTrack(0, s, 0);
        return lists;
    }

    public void backTrack(int start, String s, int len) {
        if (len == s.length()) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String str = s.substring(start, i + 1);
            if (!isPalindrome(str)) {
                continue;
            }
            int lenSum = len + i + 1 - start;
            list.add(str);
            backTrack(i + 1, s, lenSum);
            list.remove(list.size() - 1);
        }
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> lists = new Day02_131().partition(s);
        System.out.println(lists);
    }
}
