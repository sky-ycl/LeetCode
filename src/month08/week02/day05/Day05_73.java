package month08.week02.day05;

public class Day05_73 {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[][] temp=new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]==0) temp[i][j]= true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(temp[i][j]==true){
                    for (int k = 0; k < m; k++) {
                        matrix[i][k]=0;
                    }
                    for (int k = 0; k < n; k++) {
                        matrix[k][j]=0;
                    }
                }
            }
        }
    }
}
