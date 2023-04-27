package month04.week03.day02;

import java.util.ArrayList;
import java.util.List;

/*给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答案。
示例 1：

输入：words = ["bella","label","roller"]
输出：["e","l","l"]

示例 2：

输入：words = ["cool","lock","cook"]
输出：["c","o"]
*/
public class Day02_1002 {
    public List<String> commonChars(String[] words) {
        if (words.length == 0) return null;
        //初始化,统计除第一个字符串外字符的出现频率
        int[] res = new int[26];
        //取出第一个单词
        String s=words[0];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res[c-'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            String s1=words[i];
            int[] tmp=new int[26];
            for(int j=0;j<s1.length();j++){
                char c1=s1.charAt(j);
                //统计该单词每个元素出现的数量
                tmp[c1-'a']++;
            }
            //更新，取两个数组最小的数
            for(int j=0;j<26;j++){
                res[j]=Math.min(res[j],tmp[j]);
            }
        }
        List<String> list=new ArrayList<>();
        //将res统计的字符次数，转化成输出形式
        for (int i = 0; i < 26; i++) {
            while(res[i]!=0){
                list.add(""+(char)(i+'a'));
                res[i]--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words={"bella","label","roller"};
        List<String> list = new Day02_1002().commonChars(words);
        System.out.println(list);
    }
}



















