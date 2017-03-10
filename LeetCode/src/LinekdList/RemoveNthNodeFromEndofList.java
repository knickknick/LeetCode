package LinekdList;


public class RemoveNthNodeFromEndofList {

//	Given a linked list, remove the nth node from the end of list and return its head.
//
//  For example,
//
//	Given linked list: 1->2->3->4->5, and n = 2.
//
//  After removing the second node from the end, the linked list becomes 1->2->3->5.
//  Note:
//  Given n will always be valid.
//	Try to do this in one pass.
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 if(head == null) return null;

		 ListNode itemp = head;
		 ListNode jtemp = head;
		 
		 //先让第一个指针走N步
		 for(int i = 0;i < n - 1 ;i++){
			 if(itemp == null) return head;
			 itemp = itemp.next;
		 }
		 //考虑被删除的有可能刚好是头结点
		 if(itemp.next == null){
			 head = head.next;
			 return head;
		 }
		 //保证i和j要相差N步，这样要删除的刚好是j的next
		 itemp = itemp.next;
		 while(itemp.next != null){
			 itemp = itemp.next;
			 jtemp = jtemp.next;
		 }
		 //执行删除节点
		 itemp = jtemp.next;
		 jtemp.next = itemp.next;
		 return head;
	  }
}
