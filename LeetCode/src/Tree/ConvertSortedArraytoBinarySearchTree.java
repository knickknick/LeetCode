package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.


public class ConvertSortedArraytoBinarySearchTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}


    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length == 0) return null;	    
    	//这里运用了递归函数，三个参数的意义：头节点，尾节点，要操作的数组
    	return helper(0,nums.length - 1,nums);
    }

    public TreeNode helper(int start,int end,int[] nums){
    	/*
    	 * 由于是排序数组，利用二分查找思想每次取得数组中点值作为树的根，分别对左子树右子树调用递归函数即可
    	 */
    	if(start > end) return null;	
    	TreeNode temp = new TreeNode(nums[(end + start)/2]);
    	temp.left = helper(start,(end + start)/2 - 1,nums);
    	temp.right = helper((end + start)/2 + 1,end,nums); 	
    	return temp;
    }

}
