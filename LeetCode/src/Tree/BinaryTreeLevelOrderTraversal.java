package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//num:102
//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its level order traversal as:
//[
//  [3],
//  [9,20],
//  [15,7]
//]


public class BinaryTreeLevelOrderTraversal {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}
	
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        
		 
		 List<List<Integer>> res= new ArrayList<>();
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();	 
		 queue.offer(root);
		 //如果空值，则应返回[]，而不是null
 		 if(root == null) return res;
		 //循环遍历直到队列为空队列
		 while(!queue.isEmpty()){
			 List<Integer> list = new ArrayList<>();
			 //此变量的设立时关键，用来进行层次遍历周期的计数，表示此层只要循环len次刚刚好
			 int len = queue.size();
			 //依次将下一级压入队列
			 for(int i = 0 ; i < len ; i++){			 
				 if(queue.peek().left != null) queue.offer(queue.peek().left);
				 if(queue.peek().right != null) queue.offer(queue.peek().right);
				 list.add(queue.poll().val);
			 }
			 res.add(list);
		 }
	     return res;
	    }
	

}
