package study.sort;

import java.util.Arrays;

public class selectSort {
    //选择排序
    public static void selectSort(int []arr){
        int index=0;
        for (int j = 0; j < arr.length; j++) {
            int min=arr[j];
            for (int i = j; i < arr.length ; i++) {
                //找到最小值
                if(min>=arr[i]){
                    min=arr[i];
                    index=i;
                }
            }
            int tmp=arr[index];
            arr[index]=arr[j];
            arr[j]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        selectSort(arr);
    }
}
