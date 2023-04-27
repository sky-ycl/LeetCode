package month01.week01.day05;


import java.util.*;

/*给定两个数组 nums1 和 nums2 ，返回 它们的交集 。
输出结果中的每个元素一定是 唯一 的。
我们可以 不考虑输出结果的顺序 。
*/
public class Day05_03 {
    public Set<Integer> getIntersection(int []nums1,int []nums2){
        //创建两个set集合
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int j : nums2) {
            set2.add(j);
        }
        //取两个集合的交集
        set1.retainAll(set2);
        return set1;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set = getIntersection(nums1, nums2);
        //将set集合的元素放入当新数组中
        int index=0;
        int[] arr = new int[set.size()];
        for (int num : set) {
            arr[index++]=num;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] res = new Day05_03().intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));

    }
}
