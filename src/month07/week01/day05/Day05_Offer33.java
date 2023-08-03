package month07.week01.day05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day05_Offer33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

    public static void main(String[] args) {
        int[] postorder={1,3,2,5,7,6,4};
        boolean res = new Day05_Offer33().verifyPostorder(postorder);
        System.out.println(res);
    }
}
