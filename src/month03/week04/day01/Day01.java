package month03.week04.day01;

import java.util.*;

/*编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串""。
示例 1：
输入：strs = ["flower","flow","flight"]
输出："fl"

示例 2：

输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀。
*/
public class Day01 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int len = strs[0].length();
        int strLen = strs.length;
        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strLen; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++) {
            String s = scan.nextLine();
            String[] split = s.split(s);
            for(int j=0;j<split.length;j++) {
                int num = Integer.parseInt(split[j]);
                list.add(num);
            }
        }
        System.out.println(list);
        }
    }
