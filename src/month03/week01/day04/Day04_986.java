package month03.week01.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*给定两个由一些 闭区间 组成的列表，firstList 和 secondList ，
其中 firstList[i] = [starti, endi] 而 secondList[j] = [startj, endj] 。
每个区间列表都是成对 不相交 的，并且 已经排序 。
返回这 两个区间列表的交集 。
形式上，闭区间 [a, b]（其中 a <= b）表示实数 x 的集合，而 a <= x <= b 。
两个闭区间的 交集 是一组实数，要么为空集，要么为闭区间。例如，[1, 3] 和 [2, 4] 的交集为 [2, 3] 。
*/
public class Day04_986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < firstList.length && j < secondList.length) {
            int num1 = Math.max(firstList[i][0], secondList[j][0]);
            int num2 = Math.min(firstList[i][1], secondList[j][1]);
            if (num1 <= num2) {
                list.add(new int[]{num1, num2});
            }
            if(firstList[i][1]<secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int []arr1={1,2,3};
        int []arr2={1,2,3};

        List<int []> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);
        int[] ints = list.get(1);
        System.out.println(ints[1]);
        System.out.println(list.get(1)[1]);
        System.out.println((long) 256*1024*1024*8/32);

    }
}
