package Tree;

//Given a binary tree, determine if it is a valid binary search tree (BST).
//Assume a BST is defined as follows:
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
//Example 1:
//  2
// / \
//1   3
//Binary tree [2,1,3], return true.
//Example 2:
//  1
// / \
//2   3
//Binary tree [1,2,3], return false.

public class ValidateBinarySearchTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}
	
	public boolean isValidBST(TreeNode root) {
        //Ĭ�Ͽ�����������
		if(root == null) {return true;}
		else{
			
			/*
			 * �����˵ݹ����˼�룬�������ǴӸ��ڵ����£�ʵ�������Եײ����ϲ���жϵĵݹ�
			 * ������ʶ�ֱ�Ϊ���������������ж��Ľ��
			 */
			boolean flagl = true;
			boolean flagr = true;
			
			if(root.left != null) {
				TreeNode max = root.left;
				//ȡ�������������ֵ
				while(max.right != null){
					max = max.right;
				}
				//���ڵ��Ƿ�������������������ֵ���Լ����������Ƿ�Ҳ��һ������ƽ����
				flagl = root.val > max.val && isValidBST(root.left);
			}
			
			if(root.right != null) {
				TreeNode min = root.right;
				//ȡ������������Сֵ
				while(min.left != null){
					min = min.left;
				}
				//���ڵ��Ƿ�����С������������Сֵ���Լ����������Ƿ�Ҳ��һ������ƽ����
				flagr = root.val < min.val && isValidBST(root.right);
			}
			
			if(flagl && flagr){
					return true;	
			}else{
				return false;
			}
		}
    }
}
