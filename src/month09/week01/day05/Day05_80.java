package month09.week01.day05;

public class Day05_80 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int left = 1;
        int right = 1;
        while (right < n) {
            if (nums[right] != nums[right - 1]) {
                nums[left]=nums[right];
            }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int res = new Day05_80().removeDuplicates(nums);
        System.out.println(res);
    }
}
