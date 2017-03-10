package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//For example:
//Given the below binary tree and sum = 22,
//              5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
//return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.


public class PathSum {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}

	public class Solution {
	    public boolean hasPathSum(TreeNode root, int sum) {
	    	
	    	if(sum == 0) return true;
	        if(root == null) return false;      
	        //���õݹ�˼�룬��sum - root.val����sum���еݹ飬�жϳ���������ΪsumΪ�㲢�Ҹýڵ�ΪҶ�ӽڵ�
	        sum = sum - root.val;
	        if(sum == 0 && root.left == null && root.right == null) return true;
	        return  hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	    }
	}

}
