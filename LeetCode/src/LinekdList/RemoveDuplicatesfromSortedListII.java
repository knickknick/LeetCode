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
    	 * 参考083的最佳做法，递归调用，但是比083复杂，主要在于：
    	 * 由于要删除所有重复的节点，则一旦发现重复，第一个节点也要删除
    	 * 由于要涉及最少三组比较，故应该判断所有可能出现null的情况以免出现空指针异常
    	 */
    	if(head == null || head.next == null) return head;
    	
    	//注意这里的循环体，第一步是判定是否是重复数字，第二步将next指针移动到下一个非重复数字
    	while(head.val == head.next.val){
    		while(head.val == head.next.val){
    			if(head.next.next == null)	return null;
    			head.next = head.next.next;
    		}
    		head = head.next;
			if(head.next == null)	return head;
    	}    
    	//递归调用
    	head.next = deleteDuplicates(head.next);
        return head;
    }
	
	public static void main(String[] args) {

	}

}
