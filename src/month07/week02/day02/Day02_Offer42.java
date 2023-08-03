package month07.week02.day02;

public class Day02_Offer42 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for (int num : nums) {
            if(num>0){
                sum+=num;
            }else{
                sum=num;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}
