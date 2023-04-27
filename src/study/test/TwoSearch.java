package study.test;

import java.util.LinkedList;
import java.util.List;

public class TwoSearch {
    public int twoSearch(int val, int left, int right, int[] arr) {
        //递归结束条件
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (val > midVal) {
            return twoSearch(val, mid + 1, right, arr);
        } else if (val < midVal) {
            return twoSearch(val, left, mid, arr);
        } else {
            List<Integer> list = new LinkedList<>();
            list.add(mid);
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res = new TwoSearch().twoSearch(9, 0, arr.length - 1, arr);
        System.out.println(res);
    }
}

