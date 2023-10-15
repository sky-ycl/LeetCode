package month08.week04.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    private List<List<Integer>> lists = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();
    int res = 0;
    int sum = 0;

    public int get(int[] nums, int u, int v) {
        backTrack(nums, 0, u, v);
        System.out.println(lists);
        return res;
    }

    public void backTrack(int[] nums, int start, int u, int v) {
        if (start >= nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            lists.add(new ArrayList<>(list));
            sum += nums[i];
            if (sum / list.size() == u / v)
                if (list.size() == i + 1) {
                    backTrack(nums, i + 1, u, v);
                }
            Integer num = list.remove(list.size() - 1);
            sum -= num;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int u = scan.nextInt();
        int v = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scan.nextInt();
        }
        Main1 main1 = new Main1();
        int res = main1.get(nums, u, v);
        System.out.println(res);


    }
    /*

    6 5 2
    2 4 1 3 2 3
    6

    3 2 1
    4 2 6
    */
}
