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
		 //����ת�Ĺؼ�ѭ���壬�漰�����ڵ�pre,head,head.next
		 //temp������ʱ����next�ڵ�
		 while(temp != null){
			 temp = head.next;
			 head.next = pre;
			 pre = head;
			 head = temp;
		 }
		 return pre;
     }
}
