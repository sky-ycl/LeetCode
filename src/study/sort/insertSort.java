package study.sort;

import java.util.Arrays;

public class insertSort {
    public static void insertSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                int tmp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        insertSort(arr);
    }
}
