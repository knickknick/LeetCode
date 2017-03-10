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
		 //�����ֵ����Ӧ����[]��������null
 		 if(root == null) return res;
		 //ѭ������ֱ������Ϊ�ն���
		 while(!queue.isEmpty()){
			 List<Integer> list = new ArrayList<>();
			 //�˱���������ʱ�ؼ����������в�α������ڵļ�������ʾ�˲�ֻҪѭ��len�θոպ�
			 int len = queue.size();
			 //���ν���һ��ѹ�����
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
