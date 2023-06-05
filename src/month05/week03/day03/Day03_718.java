package month05.week03.day03;

public class Day03_718 {
    public int findLength1(int[] nums1, int[] nums2) {
        int maxLen = 0;
        //dp[i][j]表示以i-1 和j-1结尾的最长子数组
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 0, 0, 0, 1};
        int[] nums2 = {1, 0, 0, 1, 1};
        int length = new Day03_718().findLength(nums1, nums2);
        System.out.println(length);
    }

    private int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        int max = 0;
        //初始化
        for (int j = 0; j < nums2.length; j++) {
            if (nums1[0] == nums2[j]) {
                dp[0][j] = 1;
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == nums2[0]) {
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && i > 0 && j > 0) {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                    max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}
