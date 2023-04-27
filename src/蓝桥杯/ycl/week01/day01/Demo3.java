package 蓝桥杯.ycl.week01.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> lists = new ArrayList<>();
        int size = scan.nextInt();
        int a = 2;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int num = scan.nextInt();
            if (i == a - 1) {
                lists.add(new ArrayList<>(list));
                a = a * 2;
                list.clear();
            }
            if (i == size - 1) {
                list.add(num);
                lists.add(new ArrayList<>(list));
            }
            list.add(num);
        }
        System.out.println(lists);
        int depth = 0;
        int maxSum = 0;
        for (int i = 0; i < lists.size(); i++) {
            int sum = 0;
            for (int j = 0; j < lists.get(i).size(); j++) {
                sum += lists.get(i).get(j);
            }
            if (sum > maxSum) {
                maxSum=sum;
                depth = i + 1;
            }
        }
        System.out.println(depth);
    }
}
