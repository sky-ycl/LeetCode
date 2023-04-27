package month03.week03.day01;

import node.treeNode.TreeNode;

public class Day01_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recursion(nums, 0, nums.length-1);
    }

    public TreeNode recursion(int []nums,int left,int right){
        if(left>right){
            return null;
        }
        int index=left;
        for(int i=left+1;i<=right;i++){
            if(nums[i]>nums[index]){
                index=i;
            }
        }
        TreeNode node = new TreeNode(nums[index]);
        node.left=recursion(nums,left,index-1);
        node.right=recursion(nums,index+1,right);
        return node;
    }
    public static void main(String[] args) {
        int []nums={3,2,1,6,0,5};
        TreeNode treeNode = new Day01_654().constructMaximumBinaryTree(nums);
        System.out.println(treeNode);

    }
}
