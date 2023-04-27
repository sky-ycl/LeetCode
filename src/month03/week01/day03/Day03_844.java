package month03.week01.day03;

import java.util.ArrayList;
import java.util.List;

public class Day03_844 {
    public boolean backspaceCompare(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && list1.size() != 0) {
                list1.remove(list1.size() - 1);
                continue;
            }
            if (s.charAt(i) != '#') {
                list1.add(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && list2.size() != 0) {
                list2.remove(list2.size() - 1);
                continue;
            }
            if (t.charAt(i) != '#') {
                list2.add(t.charAt(i));

            }
        }
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        boolean res = new Day03_844().backspaceCompare(s, t);
        System.out.println(res);
    }
}
