package month03.week04.day02;

import java.util.Arrays;

/*给你一个长度为 n 的整数数组nums和 一个目标值target。
请你从 nums 中选出三个整数，使它们的和与target最接近。
返回这三个数的和。
假定每组输入只存在恰好一个解。
示例 1：
输入：nums = [-1,2,1,-4], target = 1
输出：2
解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
示例 2：
输入：nums = [0,0,0], target = 1
输出：0
*/
public class Day02_16 {
    public int threeSumClosest(int[] nums, int target) {
        //数组排序
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if(sum>target){
                    right--;
                }else if(sum<target){
                    left++;
                }else{
                    return ans;
                }
            }
        }
        return ans;
    }
}
