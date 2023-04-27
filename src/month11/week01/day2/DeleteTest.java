package month11.week01.day2;

public class DeleteTest {
    /*删除有序数组的重复项
     * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，
     * 使每个元素 只出现一次 ，返回删除后数组的新长度。
     * 元素的 相对顺序 应该保持 一致 。*/
    public int removeDuplicates(int[] nums) {
        //利用双指针
        //创建一个快指针
        int fast;
        //创建一个慢指针
        int slow=1;
        //用快指针遍历数组的所有元素
        if (nums.length == 1) {
            return 1;
        } else {
            for (fast=1; fast < nums.length; fast++) {
                if (nums[fast-1]!=nums[fast]) {
                    nums[slow]=nums[fast];
                    slow++;
                }
            }
        }
        return slow;
    }
    public static void main(String[] args) {
        int []nums=new int[]{0,0,1,1,1,2,2,3,3,4};
        DeleteTest d = new DeleteTest();
        int length=d.removeDuplicates(nums);
        System.out.println("数组的长度为："+length);
        for (int j = 0; j <length; j++) {
            System.out.print(nums[j]+"  ");
        }
    }
}
