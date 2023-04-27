package month01.week05.day04;

import java.util.ArrayList;
import java.util.List;

public class Day04_17 {
    List<String> list = new ArrayList<>();
    StringBuffer sb = new StringBuffer();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backStack(digits, 0, str);
        return list;
    }

    public void backStack(String digits, int index, String[] str) {
        if (digits.length() == sb.length()) {
            list.add(sb.toString());
            return;
        }
        char[] arr = str[digits.charAt(index) - '2'].toCharArray();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            backStack(digits, index + 1, str);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> list = new Day04_17().letterCombinations(digits);
        System.out.println(list);
    }
}
