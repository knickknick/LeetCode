package LinekdList;

//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing together the nodes of the first two lists.

import java.util.LinkedList;
import java.util.List;

public class TwoSortedLists {
	
	public class ListNode {
	     
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	
    	/*
    	 * ��������ǿռ临�Ӷȣ�����Ӧ�ñȽϼ򵥣����½���һ��������������Ϳ���
    	 * 
    	 */
    	if(l1 == null) {
    		return l2;
    	}
    	if(l2 == null) {
    		return l1;
    	}
    	ListNode m;
    	
    	if(l1.val <= l2.val){
    		m = l1;
    		//�ݹ����
    		m.next = mergeTwoLists(l1.next, l2);
    	}
    	else{
    		m = l2;
    		//�ݹ����
    		m.next = mergeTwoLists(l1, l2.next);
    	}
    	return m;
    }
}
