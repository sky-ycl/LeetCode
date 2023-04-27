package month12.week02.day03;

/*编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。
该矩阵具有以下特性：
每行的元素从左到右升序排列。
每列的元素从上到下升序排列。
思路：1、直接遍历
     2、使用二分查找方法*/

public class Day03_01 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix) {
            //int index = twoSearch(arr, target, 0, arr.length - 1);
            int index = twoSearch1(arr, target);
            if (index >= 0) {
                return true;
            }
        }
        return false;
    }

    //二分查找(递归)
    public int twoSearch(int[] arr, int target, int left, int right) {
        //找到中间值
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        //递归结束条件
        if (left > right) {
            return -1;
        }
        //查找值小于中间值
        if (target < midVal) {
            return twoSearch(arr, target, left, mid - 1);
            //查找值大于中间值
        } else if (target > midVal) {
            return twoSearch(arr, target, mid + 1, right);
            //查找值等于中间值
        } else {
            return mid;
        }
    }

    //二分查找(非递归)
    public int twoSearch1(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        //中间值
        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = arr[mid];
            if (target < midVal) {
                right = mid - 1;
            } else if (target > midVal) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean result = new Day03_01().searchMatrix(matrix, 3);
        System.out.println(result);
    }
}
