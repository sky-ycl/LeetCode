package month08.week01.day04;

import java.util.ArrayList;
import java.util.List;

public class Day04_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length-1;

        List<Integer> res = new ArrayList<>();
        while (true) {
            for (int i = left; i <= right; i++) res.add(matrix[up][i]);
            if (++up > down) break;
            for (int i = up; i <= down; i++) res.add(matrix[i][right]);
            if (--right < left) break;
            for (int i = right; i >= left; i--) res.add(matrix[down][i]);
            if (--down < up) break;
            for (int i = down; i >= up; i--) res.add(matrix[i][left]);
            if (++left > right) break;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = new Day04_54().spiralOrder(matrix);
        System.out.println(res);
    }
}
