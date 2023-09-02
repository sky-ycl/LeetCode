package month08.week04.day01;

import java.util.ArrayList;
import java.util.List;

public class Day01_36 {
    public boolean isValidSudoku(char[][] board) {
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char c = board[i][j];
                if (c != ',' && list.contains(c)) return false;
                list.add(c);
            }
        }
        list.clear();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char c = board[j][i];
                if (c != ',' && list.contains(c)) return false;
                list.add(c);
            }
        }
        list.clear();
        return false;
    }
}
