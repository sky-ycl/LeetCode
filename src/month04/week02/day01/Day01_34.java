package month04.week02.day01;

public class Day01_34 {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int[] arr={-1,-1};
        if(nums.length==0){
            return arr;
        }
        while (left<=right){
            if(nums[left]==target){
                arr[0]=left;
                break;
            }
            left++;
        }
        while(left<=right){
            if(nums[right]==target){
                arr[1]=right;
                break;
            }
            right--;
        }
        return arr;
    }
}
