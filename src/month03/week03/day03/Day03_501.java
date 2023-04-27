package month03.week03.day03;

import node.treeNode.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*给你一个含重复值的二叉搜索树（BST）的根节点 root ，找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
如果树中有不止一个众数，可以按 任意顺序 返回。
假定 BST 满足如下定义：
结点左子树中所含节点的值 小于等于 当前节点的值
结点右子树中所含节点的值 大于等于 当前节点的值
左子树和右子树都是二叉搜索树
*/
public class Day03_501 {
    private int count=0;
    private int maxCount=0;
    private List<Integer> res=new ArrayList<>();
    TreeNode pre=null;
    public int[] findMode(TreeNode root) {
        dfs(root);
        int size=res.size();
        int[] arr=new int[size];
        int index=0;
        for (Integer num : res) {
            arr[index++]=num;
        }
        return arr;
    }
    public void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        dfs(root.left);
        if(pre==null || pre.val!=root.val){
            count=1;
        }else if(pre.val==root.val){
            count++;
        }
        pre=root;
        if(count==maxCount){
            res.add(root.val);
        }
        if(count>maxCount){
            maxCount=count;
            res.clear();
            res.add(root.val);
        }
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(2);
        root.right=node;
        node.left=node1;
        int[] ints = new Day03_501().findMode(root);
        System.out.println(Arrays.toString(ints));
    }
}
