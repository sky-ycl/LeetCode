package month12.week01.day02;


public class Day02_02 {
    /*
    * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。
    * 请使用 原地 算法。*/
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean []row=new boolean[3];
        boolean []col=new boolean[3];
        //遍历每个数组
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(row[i]||col[j]==true){
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]matrix=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}
