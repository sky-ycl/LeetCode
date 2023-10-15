package month09.week01.day03;

import java.util.ArrayList;
import java.util.List;

public class Day03_36 {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(list.contains(board[i][j])) return false;
                list.add(board[i][j]);
            }
        }
        list.clear();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(list.contains(board[j][i])) return false;
                list.add(board[j][i]);
            }
        }
        list.clear();
       return true;
    }

    public static void main(String[] args) {
        int[][][] subboxes = new int[3][3][9];
        for (int i = 0; i < subboxes.length; i++) {
            for (int j = 0; j < subboxes[0].length; j++) {
                for (int k = 0; k < subboxes[0][0].length; k++) {
                    System.out.print(subboxes[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("=========");
        // 打印三维数组的内容
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 9; k++) {
                    System.out.print(subboxes[i][j][k] + " ");
                }
                System.out.println(); // 换行
            }
            System.out.println(); // 换行，用于分隔每个子数组
        }
    }
}
