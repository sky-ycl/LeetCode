package month01.week01.day04;

/*给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
*/
public class Day04_01 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <=right) {
            int mid = (left + right) / 2;
            int midVal = nums[mid];
            if (midVal < target) {
                left = mid + 1;
            } else if (midVal > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int search = new Day04_01().search(nums, 0);
        System.out.println(search);
    }
}