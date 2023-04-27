package month02.week04.day04;


import java.util.Arrays;
import java.util.Comparator;

/*给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。
返回 需要移除区间的最小数量，使剩余区间互不重叠 。
*/
public class Day04_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
               return ints[0]-t1[0];
            }
        });
        //表示最大的区间大小
        int count=0;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<intervals[i-1][1]){
                count++;
                intervals[i][1]=Math.min(intervals[i][1],intervals[i-1][1]);
            }
        }
        return count;
    }
}
