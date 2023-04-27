package month01.week01.day03;

/*求最长连续递增序列
 * */
public class Day03_01 {
    public int findLengthArr(int[] arr) {
        //双指针解法
        int res = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            //最长连续递增序列
            res = Math.max(res, i - j);
            //前面的值比后面的值大时
            if (arr[i - 1] >= arr[i]) {
                j = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7,5,9};
        int res = new Day03_01().findLengthArr(arr);
        System.out.println(res);
    }
}
