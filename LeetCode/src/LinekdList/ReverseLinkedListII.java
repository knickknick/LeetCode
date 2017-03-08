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

public class ReverseLinkedListII {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(head == null) return null;
    	if(head.next == null || m == n) return head;
    	
    	ListNode begin = new ListNode(0);
    	begin.next = head;
    	ListNode pre =begin;
    	
    	for(int i = 1 ; i < m ;i++){
    		pre = pre.next;
    	}
    	//此为LeetCode上最高亮的java解法，个人理解为插空法
    	ListNode start = pre.next;   	
    	ListNode then = start.next;
    	/*
    	 * 算法的主要实现部分：
    	 * pre为遍历区间的前一个节点，则pre.next为遍历区间的头节点
    	 * then是遍历指针指向的节点，也是需要插空的节点
    	 * start.next用来临时储存then的next节点，类似于其他算法里的temp
    	 */
    	for(int i = 0 ; i < n - m; i ++){
    		start.next = then.next ;
    		then.next = pre.next;
    		pre.next = then;
    		then = start.next;
    	}

        return begin.next;
    }
	
	public static void main(String[] args) {

	}

}
