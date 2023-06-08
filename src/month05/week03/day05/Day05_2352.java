package month05.week03.day05;

import org.junit.Test;

public class Day05_2352 {
    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (equal(row, col, n, grid)) {
                    res++;
                }
            }
        }
        return res;
    }

    public boolean equal(int row, int col, int n, int[][] grid) {
        for (int i = 0; i < n; i++) {
            if (grid[row][i] != grid[i][col]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testEqualPairs() {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        int res = equalPairs(grid);
        System.out.println(res);
    }
}
