package month03.week04.day06;

public class Day06_1137 {
    public int tribonacci(int n) {
        //int[] dp=new int[n+1];
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        /*dp[0]=0;
        dp[1]=dp[2]=1;
        for (int i = 3; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];*/

        int p=1,q=1,r=0,s=0;
        for (int i = 3; i <= n; i++) {
            s=p+q+r;
            r=q;
            q=p;
            p=s;
        }
        return s;
    }

    public static void main(String[] args) {
        int res = new Day06_1137().tribonacci(25);
        System.out.println(res);
    }
}
