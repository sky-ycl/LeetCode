package month08.week01.day02;

public class Day02_Offer53 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int min = (left + right) / 2;
            if (nums[min] == min) {
                left = min + 1;
            } else if (nums[min] > min) {
                right = min;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) {
        int a = 3, b = 3;
        int c = a & b;
        System.out.println(c);
    }
}
