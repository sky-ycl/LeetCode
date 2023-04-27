package month02.week01.day05;

public class Day05_162 {
    public int findPeakElement(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        if(nums.length==2){
            if(nums[0]>nums[nums.length-1]){
                return 0;
            }else if (nums[0]<nums[nums.length-1]){
                return nums.length-1;
            }else {
                return 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length-1;
    }
}
