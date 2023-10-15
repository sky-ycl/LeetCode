package month08.week04.day05;

import java.util.Scanner;

public class Day05_1035 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double n = scan.nextInt();
            double res = 0;
            int m = scan.nextInt();
            for (int i = 0; i < m; i++) {
                res += n;
                n = Math.sqrt(n);
            }
            String s = String.format("%.2f", res);
            System.out.println(s);
        }
    }
}
