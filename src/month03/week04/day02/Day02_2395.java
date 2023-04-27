package month03.week04.day02;

public class Day02_2395 {
    public boolean findSubarrays(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int sum=nums[i]+nums[i+1];
            for(int j=i+1;j<nums.length-1;j++){
                if(sum==nums[j]+nums[j+1]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        boolean res = new Day02_2395().findSubarrays(nums);
        System.out.println(res);
    }
}
