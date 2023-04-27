package month03.week01.day02;

/*编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
每行中的整数从左到右按升序排列。
每行的第一个整数大于前一行的最后一个整数。
*/
public class Day02_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int col=matrix[0].length;
        int row = 0;
        //找到目标值所在的行数
        for(int i=0;i<n;i++){
            row=i;
            if(target<=matrix[row][col-1]){
                break;
            }
        }
        int leftCol=0;
        int rightCol=col-1;
        while(leftCol<=rightCol){
            int midCol=(leftCol+rightCol)/2;
            if(matrix[row][midCol]==target){
                return true;
            }
            if(target<matrix[row][midCol]){
                rightCol=midCol-1;
            }
            if(target>matrix[row][midCol]){
                leftCol=midCol+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]matrix={{1,1}};
        boolean res = new Day02_74().searchMatrix(matrix,3);
        System.out.println(res);
    }
}
