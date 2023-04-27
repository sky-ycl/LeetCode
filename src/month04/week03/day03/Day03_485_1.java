package month04.week03.day03;

public class Day03_485_1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = 0;
            int tmp = i;
            while (tmp < nums.length && nums[tmp] == 1) {
                val++;
                tmp++;
            }
            max = Math.max(val, max);
        }
        return max;
    }

}
