package study.sort;

import java.util.Arrays;
import java.util.Random;

public class bubbleSort {
    //冒泡排序
    public static void bubbleSort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = {2,0,2,1,1,0};
        int []arr1=new int[10];
        for (int i = 0; i < 10; i++) {
            int num=random.nextInt(10);
            arr1[i]=num;
        }
        bubbleSort(arr);
    }
}
