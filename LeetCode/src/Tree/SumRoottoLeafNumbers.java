package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
//
//An example is the root-to-leaf path 1->2->3 which represents the number 123.
//
//Find the total sum of all root-to-leaf numbers.
//
//For example,
//
//    1
//   / \
//  2   3
//The root-to-leaf path 1->2 represents the number 12.
//The root-to-leaf path 1->3 represents the number 13.
//
//Return the sum = 12 + 13 = 25.

public class SumRoottoLeafNumbers {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}

	public class Solution {
		/*
		 * �����˵ݹ���õ�˼�룬ÿ��������һ��ֵҪ����ʮ
		 */
		 public int sumNumbers(TreeNode root) {
			 if(root == null) return 0;		 
			 if(root.left == null && root.right ==null) return root.val;
			 return travel(root.left,root.val*10) + travel(root.right,root.val*10);
		 }
		 //�ݹ麯������������������ֱ�Ϊ��ָ��ָ��Ľڵ㣬�������˽ڵ�����ֵ
		 public int travel(TreeNode root,int res){
			 if(root == null) return 0;
			 //ΪҶ�ӽڵ�������ֱ�ӷ���ֵ
			 if(root.left == null && root.right == null) return res + root.val;
			 //ע��ݹ�������������
			 return travel(root.left,(root.val + res)*10) + travel(root.right,(root.val + res)*10);
		 }
	}

}
