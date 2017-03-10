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
	    	 * ���ǵ�����������ص㣬�뵽����ջ���Ƚ��ȳ����Խ���ʵ��
	    	 * ����˳����һ·������������������ͽ�ջ��Ȼ��ָ��ָ����������
	    	 * ���������Ϊ�գ����ջ�����˻ص���һ�ڵ㣬ָ�����������ƶ������ޣ��������ջ
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
