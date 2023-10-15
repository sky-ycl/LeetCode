package month10.week01.day02;

import java.util.Arrays;

public class Day02_100096 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] res = {-1, -1};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={5,1,4,1};
        int[] res = new Day02_100096().findIndices(nums, 2, 4);
        System.out.println(Arrays.toString(res));

    }
}
