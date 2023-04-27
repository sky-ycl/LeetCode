package month02.week01.day01;

public class Day01_2319 {
    public boolean checkXMatrix(int[][] grid) {
        for (int i=0;i<grid.length;i++){
            for (int j = 0; j < grid.length; j++) {
                if(i==j || i+j==grid.length-1){
                    if(grid[i][j]==0){
                        return false;
                    }
                }else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
