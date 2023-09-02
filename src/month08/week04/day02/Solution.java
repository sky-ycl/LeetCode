package month08.week04.day02;

public class Solution {
    public int minBeautifulSum(int n, int target) {
        // 当 n 为 1 时，返回 target
        if (n == 1) {
            return target;
        }

        // 计算出最大的一个满足条件的正整数
        int maxNum = (int) Math.pow(2, n) - 1;

        // 计算出 n-1 个满足条件的正整数的和，即 1+2+4+...+2^(n-1)
        int sum = (int) Math.pow(2, n - 1) - 1;

        // 计算出 target 需要的补充数值
        int supplement = target - sum;

        // 返回最终的美丽数组的和
        return maxNum + supplement;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int n1 = 2, target1 = 3;
        int n2 = 3, target2 = 3;
        int n3 = 1, target3 = 1;

        System.out.println(solution.minBeautifulSum(n1, target1)); // Output: 4
        System.out.println(solution.minBeautifulSum(n2, target2)); // Output: 8
        System.out.println(solution.minBeautifulSum(n3, target3)); // Output: 1
    }
}
