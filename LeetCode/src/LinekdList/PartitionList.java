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
		 * ����˼�룺�ֱ�����������һ������С��X�Ľڵ㣬һ���������X�Ľڵ�
		 * ��������������ӣ�ע������sta2.next = null;�����������ܲ���ͨ��
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
