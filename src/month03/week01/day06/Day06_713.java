package month03.week01.day06;

public class Day06_713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int edd = 0;
        int product = 1;
        int count = 0;
        for (edd = 0; edd < nums.length; edd++) {
            product *= nums[edd];
            while (edd >= start && product >= k) {
                product /= nums[start];
                start++;
            }
            count += edd - start + 1;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
