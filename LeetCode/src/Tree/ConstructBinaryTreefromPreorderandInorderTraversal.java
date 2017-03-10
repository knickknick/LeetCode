package Tree;

import Tree.BinaryTreeInorderTraversal.TreeNode;


//Given preorder and inorder traversal of a tree, construct the binary tree.
//Note:
//You may assume that duplicates do not exist in the tree.

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder == null) return null;
	    return buildTree(0,0,preorder.length - 1,preorder,inorder);
	}
	
	//弄明白几个数字的含义
	public TreeNode buildTree(int prefirst,int infirst,int inlast,int[] preorder,int[] inorder){
		
		if(infirst > inlast || prefirst >= preorder.length) return null;
		
		int tempval = preorder[prefirst];
		int tempindex = 0;
		for(int i = infirst ; i < inlast;i++){
			if(inorder[i] == tempval){
				tempindex = i ;
				break;
			}
		}
		TreeNode node = new TreeNode(tempval);
		//需要注意的是如何确定第一个数字
		node.left = buildTree(prefirst + 1,infirst,tempindex - 1,preorder,inorder);
		node.right = buildTree(prefirst+ tempindex - infirst + 1,tempindex + 1,inlast,preorder,inorder);
		return node;
	}
}
