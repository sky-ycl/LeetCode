package month05.week03.day02;

import node.treeNode.TreeNode;

public class Day02_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTreeHelper(int[] preorder,int p_start,int p_edd,int[] inorder,int i_start,int i_edd){
        if(p_start>p_edd || i_start>i_edd){
            return null;
        }
        //递归结束条件
        if(p_start==p_edd){
            return new TreeNode(preorder[p_start]);
        }
        //在中序遍历找到节点位置
        TreeNode root = new TreeNode(preorder[p_start]);
        int i_root_index = 0;
        for (int i = i_start; i <=i_edd; i++) {
            if(inorder[i]==root.val){
                i_root_index=i;
                //找到就退出
                break;
            }
        }
        //看节点左边有多少的位置
        int leftNum=i_root_index-i_start;
        root.left=buildTreeHelper(preorder,p_start+1,p_start+leftNum,inorder,i_start,i_root_index-1);
        root.right=buildTreeHelper(preorder,p_start+leftNum+1,p_edd,inorder,i_root_index+1,i_edd);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder={1,2};
        int[] inorder={2,1};
        TreeNode root = new Day02_105().buildTree(preorder,inorder);
        System.out.println(root.toString());
    }
}
