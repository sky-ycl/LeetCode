package month05.week02.day04;

import node.treeNode.TreeNode;

public class Day04_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    public TreeNode dfs(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left=dfs(nums,left,mid-1);
        node.right=dfs(nums,mid+1,right);
        return node;
    }
}
