package month04.week01.day04;

public class Day04_738 {
    public int monotoneIncreasingDigits(int n) {
        String s=n+"";
        char[] nums = s.toCharArray();
        //记录第一次出现最大值的下标
        int index=-1;
        int max=-1;
        //遍历数组
        for (int i = 0; i < s.length()-1; i++) {
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
            if(nums[i]>nums[i+1]){
                nums[index]-=1;
                for(int j=index+1;j<s.length();j++){
                    nums[j]='9';
                }
            }
        }
       return Integer.parseInt(new String(nums));
    }
}
