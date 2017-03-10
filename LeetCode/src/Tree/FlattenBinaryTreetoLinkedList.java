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
        //运用了栈的先进先出特性，由于顺序实质上是先序遍历，所以用栈操作比较简便
		Stack<TreeNode> stack = new Stack<TreeNode>();
		/*
		 * 算法思想比较简单，实质上是与输出先序遍历的算法相似，只不过最后结果是输出扁平的树
		 */
		while(!stack.isEmpty() || root.left != null || root.right != null){
			/*
			 * 遍历顺序：先遍历左子树，如左子树不为空，则右子树进栈（如果有的话），直到左子树不为空
			 */
			while(root.left != null){
				if(root.right != null) stack.push(root.right);
				root.right = root.left;
				root.left = null;
				root = root.right;
			}
			//左子树为空后，这时候遍历指针指向的右子树，重新执行循环
			if(root.right != null) {
				root.left = null;
				root = root.right;
				continue;
			}
			//直到指针指向叶子节点，则出栈，回到上一个节点的右子树，重新执行循环
			if(!stack.isEmpty())  {
				root.right = stack.pop();
				root = root.right;
			}
		}   
    }


}
