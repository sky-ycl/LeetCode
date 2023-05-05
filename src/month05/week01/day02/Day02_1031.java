package month05.week01.day02;

public class Day02_1031 {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int max = Math.max(firstLen, secondLen);
        int min = Math.min(firstLen, secondLen);
        int n = nums.length;
        int maxVal = 0;
        for (int i = 0; i + max - 1 < n; i++) {
            int val1 = getSum(nums, i, i + max - 1);
            for (int j = 0; j + min - 1 < n; j++) {
                if (j + min - 1 < i || j > i + max - 1) {
                    int val2 = getSum(nums, j, j + min - 1);
                    maxVal = Math.max(maxVal, val1 + val2);
                }
            }
        }
        return maxVal;
    }

    public int getSum(int[] nums, int start, int edd) {
        int sum = 0;
        for (int i = start; i <= edd; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 15, 4, 15, 5, 20, 14, 16, 16, 10, 5, 14, 7, 12, 10};
        int res = new Day02_1031().maxSumTwoNoOverlap(nums, 7, 9);
        System.out.println(res);
        int sum = new Day02_1031().getSum(nums, 0, nums.length - 1);
        System.out.println(sum);
    }
}
