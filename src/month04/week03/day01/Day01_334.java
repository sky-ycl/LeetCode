package month04.week03.day01;

public class Day01_334 {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int[] leftMin=new int[n];
        int[] rightMax=new int[n];
        leftMin[0]=nums[0];
        rightMax[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            leftMin[i]=Math.min(leftMin[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],nums[i]);
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>leftMin[i-1] && nums[i]<rightMax[i+1]){
                return true;
            }
        }
        return false;
    }
}
