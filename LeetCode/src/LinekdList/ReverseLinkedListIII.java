package LinekdList;

//Reverse a linked list from position m to n. Do it in-place and in one-pass.
//
//For example:
//Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//
//return 1->4->3->2->5->NULL.
//
//Note:
//Given m, n satisfy the following condition:
//1 ≤ m ≤ n ≤ length of list.

public class ReverseLinkedListIII {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(head == null) return null;
    	if(head.next == null || m == n) return head;
    	
    	if(m ==1 && n == 2){
    		ListNode temp = head.next;
    		head.next = temp.next;
    		temp.next = head;
    		return temp;
    	}	
    	
    	ListNode iNode = new ListNode(0);
    	iNode.next = head;
    	ListNode jNode = new ListNode(0);
    	jNode.next = head;
    	
    	for(int i = 1 ; i < m ;i++){
    		iNode = iNode.next;
    	}
    	for(int i = 1 ; i < n ;i++){
    		jNode = jNode.next;  		
    	}
    	ListNode itemp = iNode.next;
    	ListNode jnext = jNode.next.next;   	
    	iNode.next = jNode.next;
    	iNode.next.next = itemp.next;
    	jNode.next = itemp;
    	jNode.next.next = jnext;
    	//考虑头结点被换掉
    	if(m == 1) return iNode.next;
        return head;
    }
	
	public static void main(String[] args) {

	}

}
