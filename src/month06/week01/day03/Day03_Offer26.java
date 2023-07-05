package month06.week01.day03;

import node.treeNode.TreeNode;

public class Day03_Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null){
            return false;
        }
        //当前的A头节点和B的头节点相同的话 进行比较
        if(A.val==B.val && isChildNode(A,B)){
            return true;
        }
        //当中左子树或者右子树有一个匹配到 就返回true
        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public boolean isChildNode(TreeNode A, TreeNode B) {
        //B节点为空的话说明 B是A的子节点
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        //先匹配全部的左节点 然后匹配全部的右节点  两边都是true才返回true
        return isChildNode(A.left, B.left) && isChildNode(A.right, B.right);
    }
}
