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
			//这里运用了队列的数据结构，先进先出的特性用于以层为循环单位保存每一层所有节点
	        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
	        int len = 1;
	        TreeLinkNode temp;
	        queue.offer(root);
	        while(!queue.isEmpty()){
	        	//实质上是每一层的节点数作为循环次数 - 1，按照层为单位进行next指针添加操作。
	        	len = queue.size();
	        	for(int i = 0 ; i < len - 1 ; i++){
	        		temp = queue.poll();
	        		temp.next = queue.peek();
	        		//这里先把下一层的元素按顺序放入队列
	        		if(temp.left != null)	queue.offer(temp.left);
	        		if(temp.right != null)	queue.offer(temp.right);
	        	}
	        	//由于每层最后一个next指向null，所以单独拿出来进行添加子节点和next赋值操作
	        	temp = queue.poll();
        		if(temp.left != null)	queue.offer(temp.left);
        		if(temp.right != null)	queue.offer(temp.right);
	        	temp.next = null;
	        }       
		 }
	}

}
