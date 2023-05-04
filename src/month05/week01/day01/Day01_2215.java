package month05.week01.day01;

import java.util.ArrayList;
import java.util.List;

/*
给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，请你返回一个长度为 2 的列表 answer ，其中：
answer[0] 是 nums1 中所有 不 存在于 nums2 中的 不同 整数组成的列表。
answer[1] 是 nums2 中所有 不 存在于 nums1 中的 不同 整数组成的列表。
注意：列表中的整数可以按 任意 顺序返回。

示例 1：
输入：nums1 = [1,2,3], nums2 = [2,4,6]
输出：[[1,3],[4,6]]
解释：
对于 nums1 ，nums1[1] = 2 出现在 nums2 中下标 0 处，然而 nums1[0] = 1 和 nums1[2] = 3 没有出现在 nums2 中。因此，answer[0] = [1,3]。
对于 nums2 ，nums2[0] = 2 出现在 nums1 中下标 1 处，然而 nums2[1] = 4 和 nums2[2] = 6 没有出现在 nums2 中。因此，answer[1] = [4,6]。

示例 2：
输入：nums1 = [1,2,3,3], nums2 = [1,1,2,2]
输出：[[3],[]]
解释：
对于 nums1 ，nums1[2] 和 nums1[3] 没有出现在 nums2 中。由于 nums1[2] == nums1[3] ，二者的值只需要在 answer[0] 中出现一次，故 answer[0] = [3]。
nums2 中的每个整数都在 nums1 中出现，因此，answer[1] = [] 。
*/
public class Day01_2215 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = getList(nums1);
        List<Integer> list2 = getList(nums2);
        getRes(nums1, list2);
        getRes(nums2, list1);
        return res;
    }

    public void getRes(int[] arr, List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        for (int num : arr) {
            if (!list.contains(num)) {
                if (!tmp.contains(num)) {
                    tmp.add(num);
                }
            }
        }
        res.add(new ArrayList<>(tmp));
    }

    public List<Integer> getList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> res = new Day01_2215().findDifference(nums1, nums2);
        System.out.println(res);
    }
}
