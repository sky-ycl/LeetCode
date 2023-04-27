package month03.week04.day02;

import node.treeNode.TreeNode;

public class Day02_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        //没找到节点或者该节点为空
        if(root==null){
            return null;
        }
        if(key>root.val){
            root.right=deleteNode(root.right,key);
        }else if(key<root.val){
            root.left=deleteNode(root.left,key);
        }else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            if(root.left!=null && root.right!=null){
                //寻找右子树树的最左节点
                TreeNode node=root.right;
                while(node.left!=null){
                    node=node.left;
                }
                node.left=root.left;
                root=root.right;
            }
        }
        return root;
    }
}
