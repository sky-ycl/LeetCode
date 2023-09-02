package month08.week03.day01;


/**
 * title 缺失的第一个整数
 */
public class Day01_41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // 将所有负数转化位正数
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) nums[i] = n + 1;
        }

        // 处理数组
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) nums[num - 1] = -Math.abs(nums[num - 1]);
        }
        int res = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                res = i + 1;
                break;
            }
        }
        return res = res == -1 ? n + 1 : res;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int res = new Day01_41().firstMissingPositive(nums);
        System.out.println(res);
        double a = 3;
        double b = 3;
        String result = String.format("%.2f", a - b);


    }
}
