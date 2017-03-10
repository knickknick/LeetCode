package LinekdList;

//Reverse a singly linked list.

public class ReverseLinkedList {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	 public ListNode reverseList(ListNode head) {
		
		 if(head == null) return head;
		 if(head.next == null) return head;
		 
		 ListNode temp = head;
		 ListNode pre = null;
		 //链表翻转的关键循环体，涉及三个节点pre,head,head.next
		 //temp用来临时储存next节点
		 while(temp != null){
			 temp = head.next;
			 head.next = pre;
			 pre = head;
			 head = temp;
		 }
		 return pre;
     }
}
