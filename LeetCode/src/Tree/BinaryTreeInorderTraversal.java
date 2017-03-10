package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//num:094
//Given a binary tree, return the inorder traversal of its nodes' values.
//
//For example:
//Given binary tree [1,null,2,3],
//   1
//    \
//     2
//    /
//   3
//return [1,3,2].


public class BinaryTreeInorderTraversal {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}

	public class Solution {
	    public List<Integer> inorderTraversal(TreeNode root) {
	    	
	    	List<Integer> res = new ArrayList<Integer>();
	    	Stack<TreeNode> stack = new Stack<>();
	    	TreeNode temp = root;
	    	
	    	/*
	    	 * 考虑到中序遍历的特点，想到运用栈的先进先出特性进行实现
	    	 * 遍历顺序是一路向左，如果存在左子树就进栈，然后指针指向左子树；
	    	 * 如果左子树为空，则出栈，即退回到上一节点，指针向右子树移动，若无，则继续出栈
	    	 */
	    	while(!stack.isEmpty() || temp != null){
	    		while(temp != null){
					stack.add(temp);
					temp = temp.left;
	    		}
	    		temp = stack.pop();   			
	    		res.add(temp.val);
	    		temp = temp.right;
	    	}
	        return res;
	    }
	}

}
