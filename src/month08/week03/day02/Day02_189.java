package month08.week03.day02;

public class Day02_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (n < 1 || k == 0) return;
        for (int i = 0; i < k-1; i++) {
            swap(nums, i, nums.length - i - 1);
        }
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }


    public void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums={-1,-100,3,99};
        new Day02_189().rotate(nums,3);
    }
}
