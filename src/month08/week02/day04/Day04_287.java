package month08.week02.day04;

public class Day04_287 {
    public int findDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        int res = 0;
        while (left <= right) {
            int count = 0;
            // 找到中间值
            int mid = (left + right) / 2;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid + 1) count++;
            }
            if (count <= mid + 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
                res = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int num = new Day04_287().findDuplicate(nums);
        System.out.println(num);
    }
}
