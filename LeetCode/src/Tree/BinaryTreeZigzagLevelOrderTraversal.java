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
		 //�������õݹ麯������������������ֱ�Ϊ������ָ��ָ��Ľڵ㣬�������������ڷֱ浥˫����List�����������Ԫ��Ϊ����ÿ��ڵ��List
		 ergodic(root,0,res);
	     return res;
	 }
	 
	 public void ergodic(TreeNode node,int level,List<List<Integer>> res){
		
		 /*
		  * �ݹ麯���ľ���ʵ�����̣�
		  * ÿ������һ���ڵ㣬�ýڵ㴦��level�㣬ȡ�����level��List����Ϊ�����㣬����ӵ���β��������ӵ���ͷ
		  * �����������нڵ㣬����res����
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
