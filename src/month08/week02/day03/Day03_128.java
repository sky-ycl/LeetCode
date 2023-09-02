package month08.week02.day03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * title 最长连续子序列
 */
public class Day03_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        Arrays.stream(nums).forEach(num->{
            set.add(num);
        });

        int maxLength=0;
        for (Integer num : set) {
            // 判断集合中是否存在比当前数字还小一位的数字
            if(!set.contains(num-1)){
                int curNum=num;
                int curLen=1;
                while(set.contains(curNum+1)){
                    curLen++;
                    curNum++;
                }
                maxLength=Math.max(maxLength,curLen);
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums={100,4,200,1,2,3};
        int i = new Day03_128().longestConsecutive(nums);
        System.out.println(i);
    }
}
