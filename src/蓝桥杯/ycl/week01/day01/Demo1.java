package 蓝桥杯.ycl.week01.day01;

public class Demo1 {
    public static void main(String[] args) {
        int n = 2022 ;
        int[] q = new int[n] ;
        q[1] = 0 ;
        for (int i =2; i<= 2021; i++) {
            q[i]= Integer.MAX_VALUE ;
        }
        //dp
        //当前q[j] 表示 从 1~j的最短距离
        //q[j] 可以是 当前 1~j的最短距离 或者 前一状态 到 该点的最短距离
        for (int i = 1; i<= 2020; i++ )
            for (int j= i+1 ; j<=2021 && (j-i<=21); j++) {
                q[j] = Math.min(q[j], q[i] + le(i, j) ) ;
            }

        System.out.println(q[2021]) ;
    }

    public static int gcd(int a, int b ) {
        return b !=0 ? gcd(b, a%b): a ;
    }

    public static int le(int a, int b) {
        return a*b/gcd(a,b) ;
    }
}
