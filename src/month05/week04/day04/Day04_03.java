package month05.week04.day04;

import java.util.HashMap;
import java.util.Map;

public class Day04_03 {
    public int lengthOfLongestSubstring(String s) {
        //存放每个元素和元素下标
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left=Math.max(left,map.get(c) + 1);
            }
            map.put(c, i);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int res = new Day04_03().lengthOfLongestSubstring("abba");
        System.out.println(res);
    }
}
