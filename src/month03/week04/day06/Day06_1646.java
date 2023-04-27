package month03.week04.day06;

/*给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：
nums[0] = 0
nums[1] = 1
当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
返回生成数组 nums 中的 最大 值。
*/
public class Day06_1646 {
    public int getMaximumGenerated(int n) {
        if(n<2){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int maxVal=0;
        for (int i = 2; i <= n; i++) {
            int num=i/2;
            if(i%2==0){
                dp[i]=dp[num];
            }else{
                dp[i]=dp[num]+dp[num+1];
            }
            if(dp[i]>maxVal){
                maxVal=dp[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int res = new Day06_1646().getMaximumGenerated(7);
        System.out.println(res);
    }
}
