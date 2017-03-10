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
    	//���������˵ݹ麯�����������������壺ͷ�ڵ㣬β�ڵ㣬Ҫ����������
    	return helper(0,nums.length - 1,nums);
    }

    public TreeNode helper(int start,int end,int[] nums){
    	/*
    	 * �������������飬���ö��ֲ���˼��ÿ��ȡ�������е�ֵ��Ϊ���ĸ����ֱ�����������������õݹ麯������
    	 */
    	if(start > end) return null;	
    	TreeNode temp = new TreeNode(nums[(end + start)/2]);
    	temp.left = helper(start,(end + start)/2 - 1,nums);
    	temp.right = helper((end + start)/2 + 1,end,nums); 	
    	return temp;
    }

}
