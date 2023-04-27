package month11.week01.day2;

/*
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，
 * 并返回移除后数组的新长度。*/
public class RemoveDemo {
    //暴力解法
    public int removeElement1(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                        nums[--length]=0;
                    if(nums[i]==val){
                        for (int j = i; j < nums.length - 1; j++) {
                            nums[j] = nums[j + 1];
                        }
                        nums[--length]=0;
                    }
            }
        }
        return length;
    }
    //双指针解法
    public int removeElement(int []nums,int val){
        //快指针
        int fast=0;
        //慢指针
        int slow=0;
        //遍历数组
        for (fast=0; fast < nums.length; fast++) {
            if(nums[fast]!=val){
                nums[slow++]=nums[fast];
            }
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        RemoveDemo removeDemo = new RemoveDemo();
        //int length = removeDemo.removeElement1(nums, 2);
        int length=removeDemo.removeElement(nums,2);
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + "  ");
        }
    }
}
