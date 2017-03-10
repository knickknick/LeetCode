package Tree;

//Given a binary tree, determine if it is a valid binary search tree (BST).
//Assume a BST is defined as follows:
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
//Example 1:
//  2
// / \
//1   3
//Binary tree [2,1,3], return true.
//Example 2:
//  1
// / \
//2   3
//Binary tree [1,2,3], return false.

public class ValidateBinarySearchTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}
	
	public boolean isValidBST(TreeNode root) {
        //默认空树符合条件
		if(root == null) {return true;}
		else{
			
			/*
			 * 运用了递归调用思想，表面上是从根节点向下，实际上是自底层向上层层判断的递归
			 * 两个标识分别为左子树和右子树判定的结果
			 */
			boolean flagl = true;
			boolean flagr = true;
			
			if(root.left != null) {
				TreeNode max = root.left;
				//取到左子树的最大值
				while(max.right != null){
					max = max.right;
				}
				//根节点是否满足大于左子树的最大值，以及其左子树是否也是一个二叉平衡树
				flagl = root.val > max.val && isValidBST(root.left);
			}
			
			if(root.right != null) {
				TreeNode min = root.right;
				//取到右子树的最小值
				while(min.left != null){
					min = min.left;
				}
				//根节点是否满足小于右子树的最小值，以及其右子树是否也是一个二叉平衡树
				flagr = root.val < min.val && isValidBST(root.right);
			}
			
			if(flagl && flagr){
					return true;	
			}else{
				return false;
			}
		}
    }
}
