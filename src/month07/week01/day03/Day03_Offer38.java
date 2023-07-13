package month07.week01.day03;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Day03_Offer38 {
    private Set<String> set=new HashSet<>();

    public String[] permutation(String s) {
        StringBuilder builder = new StringBuilder();
        boolean[] visited=new boolean[s.length()];
        backTrack(s,builder,visited);
        return set.toArray(new String[0]);
    }

    public void backTrack(String s, StringBuilder builder, boolean[] visited) {
        // 结束条件
        if (builder.length() == s.length()) {
            set.add(builder.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            // 表示该字母已经使用过
            if (visited[i]) continue;
            builder.append(s.charAt(i));
            visited[i] = true;
            backTrack(s, builder, visited);
            builder.deleteCharAt(builder.length() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        builder1.append('0');
        builder1.append('1');
        builder1.append('2');
        System.out.println(builder1);
        builder1.deleteCharAt(2);
        System.out.println(builder1);
    }
}
