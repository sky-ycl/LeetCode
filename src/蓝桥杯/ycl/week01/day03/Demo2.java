package 蓝桥杯.ycl.week01.day03;

public class Demo2 {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 0;i<9000; i++) {
            sum = (i * (i + 1)) / 2;
            if (isHuiWen(sum)) {
                System.out.println(sum);
                break;
            }
        }
    }

    public static boolean isHuiWen(long num) {
        String s = String.valueOf(num);
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            if (s.charAt( left) != s.charAt( right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
