package month04.week03.day06;

public class Day06_1493 {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int left=0,right=0;
        int zeroNum=0;
        int res=0;
        while(right<n){
            if(nums[right]==0){
                zeroNum++;
            }
            while(zeroNum>1){
                if(nums[left]==0){
                    zeroNum--;
                }
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}
