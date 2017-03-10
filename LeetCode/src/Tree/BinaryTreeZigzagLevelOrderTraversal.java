package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import Tree.BinaryTreeLevelOrderTraversal.TreeNode;

//Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
//
//		For example:
//		Given binary tree [3,9,20,null,null,15,7],
//		    3
//		   / \
//		  9  20
//		    /  \
//		   15   7
//		return its zigzag level order traversal as:
//		[
//		  [3],
//		  [20,9],
//		  [15,7]
//		]
public class BinaryTreeZigzagLevelOrderTraversal {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}
	
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		 List<List<Integer>> res= new ArrayList<>();
		 //这里利用递归函数，三个参数的意义分别为：遍历指针指向的节点，遍历层数（用于分辨单双），List容器，里面的元素为保存每层节点的List
		 ergodic(root,0,res);
	     return res;
	 }
	 
	 public void ergodic(TreeNode node,int level,List<List<Integer>> res){
		
		 /*
		  * 递归函数的具体实现流程：
		  * 每遍历到一个节点，该节点处于level层，取出存放level的List，若为奇数层，则添加到队尾，否则添加到队头
		  * 当遍历完所有节点，返回res即可
		  */
		 
		if(node == null) return;
	 	if(level >= res.size()){
			 List<Integer> list = new ArrayList<>();
			 res.add(list);
		 }
	 	List<Integer> temp = res.get(level);
	 	if(level%2 == 0){
	 		temp.add(node.val);
	 	}else{
	 		temp.add(0,node.val);
	 	}
	 	ergodic(node.left,level + 1,res);
	 	ergodic(node.right,level + 1,res);
	 }	
}
