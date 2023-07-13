package month07.week01.day04;

import java.util.Arrays;

public class Day04_Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
       Arrays.sort(arr);
       int[] res=new int[k];
        for (int i = 0; i < k; i++) {
            res[i]=arr[i];
        }
        return res;
    }

    public void swap(int[] num, int i, int j) {
        int temp = num[j];
        num[j] = num[i];
        num[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int[] res = new Day04_Offer40().getLeastNumbers(arr, 2);
        System.out.println(Arrays.toString(res));
    }
}
