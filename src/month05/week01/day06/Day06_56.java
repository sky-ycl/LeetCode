package month05.week01.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day06_56 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        //对二维数组排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            int val1 = intervals[i][0];
            int val2 = intervals[i][1];
            if (list.size() == 0 || list.get(list.size() - 1)[1] < val1) {
                list.add(new int[]{val1, val2});
            } else {
                //看下标为1的值哪个大
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], val2);
            }
        }
        //集合转化为二维数组
        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {

    }
}
