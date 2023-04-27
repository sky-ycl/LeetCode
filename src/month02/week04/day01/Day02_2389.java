package month02.week04.day01;

import java.util.Arrays;

/*给你一个长度为 n 的整数数组 nums ，和一个长度为 m 的整数数组 queries 。
返回一个长度为 m 的数组 answer ，
其中 answer[i] 是 nums 中 元素之和小于等于 queries[i] 的 子序列 的 最大 长度  。
子序列 是由一个数组删除某些元素（也可以不删除）但不改变剩余元素顺序得到的一个数组。
*/
public class Day02_2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        //先将nums数组进行排序
        Arrays.sort(nums);
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int len = 0;
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
               if(sum+nums[j]>queries[i]){
                   break;
               }
               sum+=nums[j];
               len++;
            }
            res[i] = len;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {4, 5, 2, 1};
        int[] query = {3, 10, 21};
        int[] ints = new Day02_2389().answerQueries(num, query);
    }
}
