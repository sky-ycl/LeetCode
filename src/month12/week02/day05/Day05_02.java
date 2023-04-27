package month12.week02.day05;

import java.util.*;

/*
* 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
  字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
*/
public class Day05_02 {
    public List<List<String>> groupAnagrams(String[] str) {
        Map<String,List<String>> map=new HashMap<>();
        for (String s : str) {
            char []array=s.toCharArray();
            Arrays.sort(array);
            //叫排序好的字符串作为主键
            String key = new String(array);
            List<String> list=map.getOrDefault(key,new LinkedList<String>());
            list.add(s);
            map.put(key,list);
        }
        List<List<String>> list1=new LinkedList<>();
        for (String key:map.keySet()) {
            list1.add(map.get(key));
        }
        return list1;
    }
    public static void main(String[] args) {
        String []str={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list=new Day05_02().groupAnagrams(str);
        System.out.println(list);
    }
}
