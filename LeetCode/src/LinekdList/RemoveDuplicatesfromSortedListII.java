package LinekdList;

//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
//For example,
//Given 1->2->3->3->4->4->5, return 1->2->5.
//Given 1->1->1->2->3, return 2->3.

public class RemoveDuplicatesfromSortedListII {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode deleteDuplicates(ListNode head) {
    	/*
    	 * �ο�083������������ݹ���ã����Ǳ�083���ӣ���Ҫ���ڣ�
    	 * ����Ҫɾ�������ظ��Ľڵ㣬��һ�������ظ�����һ���ڵ�ҲҪɾ��
    	 * ����Ҫ�漰��������Ƚϣ���Ӧ���ж����п��ܳ���null�����������ֿ�ָ���쳣
    	 */
    	if(head == null || head.next == null) return head;
    	
    	//ע�������ѭ���壬��һ�����ж��Ƿ����ظ����֣��ڶ�����nextָ���ƶ�����һ�����ظ�����
    	while(head.val == head.next.val){
    		while(head.val == head.next.val){
    			if(head.next.next == null)	return null;
    			head.next = head.next.next;
    		}
    		head = head.next;
			if(head.next == null)	return head;
    	}    
    	//�ݹ����
    	head.next = deleteDuplicates(head.next);
        return head;
    }
	
	public static void main(String[] args) {

	}

}
