package month05.week01.day06;

public class Day06_560 {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        //创建一个前缀和的数组
        int[] sum=new int[n+1];
        sum[0]=0;
        for (int i = 0; i < n; i++) {
            sum[i+1]=sum[i]+nums[i];
        }
        //记录个数
        int num=0;
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < i; j++) {
                if(sum[i]-sum[j]==k){
                    num++;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        int res = new Day06_560().subarraySum(nums,3);
        System.out.println(res);
    }
}
