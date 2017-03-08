package LinekdList;

//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
//
//For example,
//Given 1->4->3->2->5->2 and x = 3,
//return 1->2->2->4->3->5.

public class PartitionList {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode partition(ListNode head, int x) {
		/*
		 * 核心思想：分别建立两个链表，一个储存小于X的节点，一个储存大于X的节点
		 * 最后将两个链表连接，注意设置sta2.next = null;，否则程序可能不会通过
		 */
		
		if(head == null) return head;	
		ListNode sta1 = new ListNode(0);
		ListNode sta2 = new ListNode(0);
		ListNode dummy1 = sta1;
		ListNode dummy2 = sta2;

		while(head != null){
			if(head.val < x) {
				sta1.next = head ;
				sta1 = head;
			}else{
				sta2.next = head ;
				sta2 = head;
			}
			head = head.next;
		}
		sta2.next = null;
		sta1.next = dummy2.next;		
		return dummy1.next;
	}
}
