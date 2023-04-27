package month04.week03.day03;

public class Day03_485_2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int pre=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                max=Math.max(max,i-pre-1);
                pre=i;
            }
            if(i==nums.length-1 && nums[i]!=0){
                max=Math.max(max,i-pre);
            }
        }
        return max;
    }
}
