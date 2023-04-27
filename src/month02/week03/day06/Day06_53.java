package month02.week03.day06;

/*给你一个整数数组 nums ，
请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
子数组 是数组中的一个连续部分。*/
public class Day06_53 {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum = 0;
        int sumMax = nums[0];
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumMax = Math.max(sumMax, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return sumMax;
    }

    public static void main(String[] args) {
        int []nums={-1,-2};
        int res = new Day06_53().maxSubArray(nums);
        System.out.println(res);
    }
}
