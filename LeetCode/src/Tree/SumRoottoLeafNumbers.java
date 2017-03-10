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
		 * 运用了递归调用的思想，每遍历到下一层值要乘以十
		 */
		 public int sumNumbers(TreeNode root) {
			 if(root == null) return 0;		 
			 if(root.left == null && root.right ==null) return root.val;
			 return travel(root.left,root.val*10) + travel(root.right,root.val*10);
		 }
		 //递归函数，两个参数的意义分别为：指针指向的节点，遍历到此节点计算的值
		 public int travel(TreeNode root,int res){
			 if(root == null) return 0;
			 //为叶子节点的情况，直接返回值
			 if(root.left == null && root.right == null) return res + root.val;
			 //注意递归语句里面的条件
			 return travel(root.left,(root.val + res)*10) + travel(root.right,(root.val + res)*10);
		 }
	}

}
