package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.SumRoottoLeafNumbers.TreeNode;

//Given a binary tree, flatten it to a linked list in-place.
//
//For example,
//Given
//
//       1
//      / \
//     2   5
//    / \   \
//   3   4   6
//The flattened tree should look like:
// 1
//  \
//   2
//    \
//     3
//      \
//       4
//        \
//         5
//          \
//           6
//click to show hints.

public class FlattenBinaryTreetoLinkedList {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}


	public void flatten(TreeNode root) {
		
        if(root == null) return;
        //������ջ���Ƚ��ȳ����ԣ�����˳��ʵ���������������������ջ�����Ƚϼ��
		Stack<TreeNode> stack = new Stack<TreeNode>();
		/*
		 * �㷨˼��Ƚϼ򵥣�ʵ���������������������㷨���ƣ�ֻ����������������ƽ����
		 */
		while(!stack.isEmpty() || root.left != null || root.right != null){
			/*
			 * ����˳���ȱ���������������������Ϊ�գ�����������ջ������еĻ�����ֱ����������Ϊ��
			 */
			while(root.left != null){
				if(root.right != null) stack.push(root.right);
				root.right = root.left;
				root.left = null;
				root = root.right;
			}
			//������Ϊ�պ���ʱ�����ָ��ָ���������������ִ��ѭ��
			if(root.right != null) {
				root.left = null;
				root = root.right;
				continue;
			}
			//ֱ��ָ��ָ��Ҷ�ӽڵ㣬���ջ���ص���һ���ڵ��������������ִ��ѭ��
			if(!stack.isEmpty())  {
				root.right = stack.pop();
				root = root.right;
			}
		}   
    }


}
