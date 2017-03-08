package LinekdList;

//Given a linked list, swap every two adjacent nodes and return its head.
//For example,
//Given 1->2->3->4, you should return the list as 2->1->4->3.
//Your algorithm should use only constant space. 
//You may not modify the values in the list, only nodes itself can be changed.

public class SwapNodesinPairs {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode swapPairs(ListNode head) {
		
		if ( head == null || head.next == null) {
			return head ;
		}else{
			ListNode temp = head.next;
			//最关键的是递归调用的代码位置选择，既然是两两互换，则每一组的第一个的next就要进行递归（先保存next节点）
			//
			head.next = swapPairs(head.next.next);
			temp.next = head;
			return temp;
		}
	}
}
