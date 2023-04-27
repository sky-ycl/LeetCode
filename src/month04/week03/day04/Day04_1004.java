package month04.week03.day04;

/*给定一个二进制数组 nums 和一个整数 k，如果可以翻转最多 k 个 0 ，则返回 数组中连续 1 的最大个数 。
* 重点：题意转换。把「最多可以把 K 个 0 变成 1，求仅包含 1 的最长子数组的长度」转换为 「找出一个最长的子数组，该子数组内最多允许有 K 个 0
 * */
public class Day04_1004 {
    public int longestOnes(int[] nums, int k) {
        int res=0;
        int n=nums.length;
        int left=0;
        int right=0;
        //表示0的数量
        int zeros=0;
        while(right<n){
            if(nums[right]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[left]==0){
                    zeros--;
                }
                  left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}
