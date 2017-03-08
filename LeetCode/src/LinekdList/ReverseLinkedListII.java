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
//1 �� m �� n �� length of list.

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
    	//��ΪLeetCode���������java�ⷨ���������Ϊ��շ�
    	ListNode start = pre.next;   	
    	ListNode then = start.next;
    	/*
    	 * �㷨����Ҫʵ�ֲ��֣�
    	 * preΪ���������ǰһ���ڵ㣬��pre.nextΪ���������ͷ�ڵ�
    	 * then�Ǳ���ָ��ָ��Ľڵ㣬Ҳ����Ҫ��յĽڵ�
    	 * start.next������ʱ����then��next�ڵ㣬�����������㷨���temp
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
