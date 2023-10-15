package month07.week01.day05;

public class Day05_Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, index = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; l <= r; i++) res[index++] = matrix[t][i];
            if (++t > b) break;
            for (int i = t; i <= b; i++) res[index++] = matrix[i][r];
            if (l > --r) break;
            for (int i = r; r >= l; i--) res[index++] = matrix[b][i];
            if (t > --b) break;
            for (int i = b; i >= t; i--) res[index++] = matrix[i][l];
            if (++l > r) break;
        }
        return res;
    }
}