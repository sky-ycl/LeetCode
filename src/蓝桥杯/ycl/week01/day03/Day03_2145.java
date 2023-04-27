package 蓝桥杯.ycl.week01.day03;

import java.util.Scanner;

public class Day03_2145 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long k = scanner.nextLong();
            //末尾有1个零
            long start = 5;
            //末尾有10^18个零
            long end = 4000000000000000020L;
            //二分查找法
            while (start <= end) {
                long mid = start + ((end - start) >> 1);
                long midRes = trailingZeroes(mid);
                if (midRes > k) {
                    end = mid - 1;
                } else if (midRes < k) {
                    start = mid + 1;
                } else {
                    while (mid % 5 != 0) {
                        mid--;
                    }
                    System.out.println(mid);
                    return;
                }
            }
            System.out.println(-1);
        }
    }

    public static long trailingZeroes(long n) {
        long res = 0;
        n /= 5;
        while (n > 0) {
            res += n;
            n /= 5;
        }
        return res;
    }
}
