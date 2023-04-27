package month11.week01.day4;

public class ContinuityArry {
    /*给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），
    返回其最大和。
    */
    //贪心算法
    public int maxSubArray(int []nums){
        int pre=0;
        int max=nums[0];
        for (int value : nums) {
            //pre表示当前这一段数组
            pre=Math.max(pre+value,value);
            //max表示最大的一段数组
            max=Math.max(max,pre);
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int add=new ContinuityArry().maxSubArray(nums);
        System.out.println(add);
    }
}

