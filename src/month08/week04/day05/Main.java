package month08.week04.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
            if (!list.contains(nums[i])) list.add(nums[i]);
        }
        // 排序
        Arrays.sort(nums);
        int num = nums[0];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                // 寻找第一个数组不存在的数字
                while (list.contains(num)) {
                    num++;
                }
                res += num - nums[i];
                // num用完一次 应该++；
                num++;
            }
        }
        System.out.println(res);
    }
}
