package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
//
//Given a binary tree
//
//struct TreeLinkNode {
//  TreeLinkNode *left;
//  TreeLinkNode *right;
//  TreeLinkNode *next;
//}
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//Initially, all next pointers are set to NULL.
//
//Note:
//
//You may only use constant extra space.
//You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
//For example,
//Given the following perfect binary tree,
//     1
//   /  \
//  2    3
// / \  / \
//4  5  6  7
//After calling your function, the tree should look like:
//     1 -> NULL
//   /  \
//  2 -> 3 -> NULL
// / \  / \
//4->5->6->7 -> NULL


public class PopulatingNextRightPointersinEachNode {
	
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) { val = x; }
	}

	public class Solution {
		 public void connect(TreeLinkNode root) {
			if(root == null) return;
			//���������˶��е����ݽṹ���Ƚ��ȳ������������Բ�Ϊѭ����λ����ÿһ�����нڵ�
	        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
	        int len = 1;
	        TreeLinkNode temp;
	        queue.offer(root);
	        while(!queue.isEmpty()){
	        	//ʵ������ÿһ��Ľڵ�����Ϊѭ������ - 1�����ղ�Ϊ��λ����nextָ����Ӳ�����
	        	len = queue.size();
	        	for(int i = 0 ; i < len - 1 ; i++){
	        		temp = queue.poll();
	        		temp.next = queue.peek();
	        		//�����Ȱ���һ���Ԫ�ذ�˳��������
	        		if(temp.left != null)	queue.offer(temp.left);
	        		if(temp.right != null)	queue.offer(temp.right);
	        	}
	        	//����ÿ�����һ��nextָ��null�����Ե����ó�����������ӽڵ��next��ֵ����
	        	temp = queue.poll();
        		if(temp.left != null)	queue.offer(temp.left);
        		if(temp.right != null)	queue.offer(temp.right);
	        	temp.next = null;
	        }       
		 }
	}

}
