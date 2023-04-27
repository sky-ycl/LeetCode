package month04.week01.day05;

public class Day05_1365_1 {
    //暴力解法 时间复杂度O(n*n)
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for (int i = 0; i < nums.length; i++) {
            int val=nums[i];
            int count=0;
            for (int num : nums) {
                if(num<val){
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}
