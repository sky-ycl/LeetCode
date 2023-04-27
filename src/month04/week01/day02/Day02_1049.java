package month04.week01.day02;

/*有一堆石头，用整数数组stones 表示。其中stones[i] 表示第 i 块石头的重量。

每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为x 和y，且x <= y。那么粉碎的可能结果如下：
如果x == y，那么两块石头都会被完全粉碎；
如果x != y，那么重量为x的石头将会完全粉碎，而重量为y的石头新重量为y-x。
最后，最多只会剩下一块 石头。返回此石头 最小的可能重量 。如果没有石头剩下，就返回 0。
*/
public class Day02_1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for (int i = 0; i < stones.length; i++) {
            sum+=stones[i];
        }
        int val=sum/2;
        int[] dp=new int[val+1];
        int max=0;
        for (int i = 0; i < stones.length; i++) {
            for(int j=val;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
                if(dp[j]>max){
                    max=dp[j];
                }
            }
        }
        return sum-2*max;
    }

    public static void main(String[] args) {
        int[] nums={2,7,4,1,8,1};
        int res = new Day02_1049().lastStoneWeightII(nums);
        System.out.println(res);
    }
}
