package month03.week02.day01;

/*给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
任何误差小于 10-5 的答案都将被视为正确答案。
示例 1：
输入：nums = [1,12,-5,-6,50,3], k = 4
输出：12.75
解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
示例 2：
输入：nums = [5], k = 1
输出：5.00000
*/
public class Day01_643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int maxSum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            maxSum=Math.max(maxSum,sum);
        }
       return 1.0*maxSum/k;
    }

    public static void main(String[] args) {
        int []nums={5};
        double maxAverage = new Day01_643().findMaxAverage(nums,1);
        System.out.println(maxAverage);
    }
}















