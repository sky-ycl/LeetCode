package month08.week02.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day05_438 {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) return new ArrayList<>();

        int sLen = s.length();
        int pLen = p.length();

        int[] sArr = new int[26];
        int[] pArr = new int[26];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < pLen; i++) {
            sArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(sArr,pArr)) list.add(0);

        for (int i = 1; i+pLen-1 < sLen; i++) {
            sArr[s.charAt(i-1)-'a']--;
            sArr[s.charAt(i+pLen-1)-'a']++;
            if(Arrays.equals(sArr,pArr)) list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> anagrams = new Day05_438().findAnagrams("abab", "ab");
        System.out.println(anagrams);
    }
}
