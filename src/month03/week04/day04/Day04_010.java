package month03.week04.day04;


/*
* 给定一个整数数组和一个整数k ，请找到该数组中和为k的连续子数组的个数。
示例 1：

输入:nums = [1,1,1], k = 2
输出: 2
解释: 此题 [1,1] 与 [1,1] 为两种不同的情况
示例 2：

输入:nums = [1,2,3], k = 3
输出: 2
* */

public class Day04_010 {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j>=0;j--){
                sum+=nums[j];
                if(sum==k){
                    count++;
                    continue;
                }
            }
        }
        return count;
    }
}

