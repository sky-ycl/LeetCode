package month02.week01.day05;

import java.util.Arrays;

public class Day05_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int left=0,right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]>target){
                right--;
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }else{
                arr[0]=left;
                arr[1]=right;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int[] arr = new Day05_167().twoSum(nums,9);
        System.out.println(Arrays.toString(arr));

    }
}
