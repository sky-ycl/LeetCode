package month04.week04.day01;

public class Day01_718 {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int res=0;
        for (int i = 0; i < n; i++) {
            int tmp = i;
            int j = 0;
            while (tmp < n && j < m ) {
                res=Math.max(res,j+1);
            }
        }
        return res;
    }
}
