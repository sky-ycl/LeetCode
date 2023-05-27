package month05.week03.day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
给你一个字符串 s 。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。

注意，划分结果需要满足：将所有划分结果按顺序连接，得到的字符串仍然是 s 。

返回一个表示每个字符串片段的长度的列表。

*/
public class Day01_763 {
    public List<Integer> partitionLabels(String s) {
            //记录每个字符结束的位置
            Map<Character, Integer> map = new HashMap<>();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                map.put(c, i);
            }
            //记录片段的起始与结束位置
            int start = 0, edd = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                //片段的结束位置一定是片段里某个字符的结束位置，找出片段里的字符中的最大结束位置
                edd = Math.max(edd, map.get(s.charAt(i)));
                //判断片段的结束位置
                if (i == edd) {
                    list.add(edd - start + 1);
                    start=edd+1;
                }
            }
            return list;
    }
}
