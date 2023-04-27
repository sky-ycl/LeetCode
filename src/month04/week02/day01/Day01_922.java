package month04.week02.day01;

public class Day01_922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int index1 = 0;
        int index2 = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[index1]=nums[i];
                index1+=2;
            }else{
                arr[index2]=nums[i];
                index2+=2;
            }
        }
        return arr;
    }
}
