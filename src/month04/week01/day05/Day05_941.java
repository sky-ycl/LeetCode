package month04.week01.day05;

public class Day05_941 {
    public boolean validMountainArray(int[] arr) {
        //最大值的地址
        int index=0;
        //找到最大值的地址
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[index]){
                index=i;
            }
        }
        if(index==0 || index==arr.length-1 ) return false;
        int left=index-1;
        int right=index+1;
        if(arr[index]==arr[left] || arr[index]==arr[right]) return false;
        while(left>0){
           if(arr[left]<=arr[left-1]) return false;
           left--;
        }
        while (right<arr.length-1){
            if(arr[right]<=arr[right+1]) return false;
            right++;
        }
        return true;
    }
}
