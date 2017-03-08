package LinekdList;

//Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

public class ConvertSortedListtoBinarySearchTree {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { 
	    val = x; 
		}
	}
	
	 public TreeNode sortedListToBST(ListNode head) {
		 if(head ==  null) return null;
		 return helper(head,null);
     }
	 
	 //�ݹ麯���������˶���˼�룬����ͷָ���βָ��
	 public TreeNode helper(ListNode head,ListNode tail){
		 if(head == tail) return null;
		 ListNode fast = head;
		 ListNode slow = head;
		 
		 //�����ҵ��м�ڵ�
		 while(fast != tail && fast.next != tail){
			 fast = fast.next.next ;
			 slow = slow.next;
		 }
		 //�����ڵ㣬�ֱ��õݹ���ý�����������
		 TreeNode treenode = new TreeNode(slow.val);
		 treenode.left = helper(head,slow);
		 treenode.right = helper(slow,tail);
		 return treenode;
	 }
}
