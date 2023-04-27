package month01.week05.day03;

public class Day03_Offer006 {
    public int[] twoSum(int[] numbers, int target) {
        int []arr=new int[2];
        int left=0,right=numbers.length-1;
        int sum=0;
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum==target){
                arr[0]=left;
                arr[1]=right;
                return arr;
            }else if(sum>target){
                right-=1;
            }else{
                left+=1;
            }
        }
        return arr;
    }
}
