package month03.week01.day05;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*给定两个字符串s和 p，找到s中所有p的异位词的子串，
返回这些子串的起始索引。不考虑答案输出的顺序。
异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
*/
public class Day05_438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;

        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount, pCount)) {
            list.add(0);
        }
        for (int i = 0; i < s.length()-p.length(); i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + p.length()) - 'a']++;
            if (Arrays.equals(sCount, pCount)) {
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new Day05_438().findAnagrams("cbaebabacd", "abc");
        System.out.println(list);
    }
}
