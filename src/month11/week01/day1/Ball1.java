package month11.week01.day1;

public class Ball1 {
    int lowLimit;//表示球开始的编号
    int highLimit;//表示球结束的编号
    public static int countBalls(int lowLimit, int highLimit) {
        //h表示篮子 元素表示篮子的个数 数组下标表示篮子的编号
        int[] h = new int[46];
        int ans = 0;
        for (int i = lowLimit, cur = 0, tmp = 0; i <= highLimit; i++) {
            cur = 0;
            tmp = i;
            while (tmp > 0) {
                cur += tmp % 10;
                tmp /= 10;
            }
            ans = Math.max(ans, ++h[cur]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a=Ball1.countBalls(1,12);
        System.out.println(a);
    }
}
