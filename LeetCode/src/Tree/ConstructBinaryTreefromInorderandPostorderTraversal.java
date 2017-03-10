package Tree;

import java.util.HashMap;
import java.util.List;

import Tree.ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode;

//Given inorder and postorder traversal of a tree, construct the binary tree.
//
//Note:
//You may assume that duplicates do not exist in the tree.

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}
	
	public TreeNode buildTree(int[] inorder,int[] preorder) {
		if(inorder == null || preorder == null || inorder.length != preorder.length) return null;
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		for (int i=0;i<inorder.length;++i){
			//这里用哈希表的原因是查找索引比较容易
			hm.put(inorder[i], i);
		}
	    return buildTreePostIn(0,preorder.length - 1,0,inorder.length - 1,preorder,inorder,hm);
	}
	
	//弄明白几个数字的含义
	public TreeNode buildTreePostIn(int prestart,int prelast,int infirst,int inlast,int[] preorder,int[] inorder,HashMap<Integer,Integer> hm){
		
		if(infirst >= inlast || prelast <= prestart)   return null;
		TreeNode node = new TreeNode(preorder[prelast]);
		int tempindex = hm.get(preorder[prelast]);
		//需要注意的是如何确定各个数字的
		TreeNode leftchild =  buildTreePostIn(prestart,prestart+tempindex-infirst-1,infirst,tempindex - 1,preorder,inorder,hm);
		node.left = leftchild ;
		TreeNode rightchild = buildTreePostIn(prestart+tempindex-infirst,prelast - 1,tempindex + 1,inlast,preorder,inorder,hm);
		node.right = rightchild ;
		return node;
	}
	
	public static void main(String[] args) {
		
	}

}
