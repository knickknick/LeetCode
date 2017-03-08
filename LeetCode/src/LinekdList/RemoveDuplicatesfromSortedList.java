package LinekdList;

import java.util.HashMap;
import java.util.Map;

//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//For example,
//Given 1->1->2, return 1->2.
//Given 1->1->2->3->3, return 1->2->3.

public class RemoveDuplicatesfromSortedList {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
   public ListNode deleteDuplicates(ListNode head) {
	  
	   if(head == null) return null;
	   
	   ListNode begin = new ListNode(0);
	   begin.next = head;
	   ListNode pre = begin;
	   ListNode start = head;
	   //运用了哈希表，哈希表的key不能重复，由此储存节点的值，运用map.containsKey判断是否重复
	   Map<Integer,ListNode> map = new HashMap<Integer,ListNode>(); 
	   
	   while(start != null){
		   if(map.containsKey(start.val)){
			   pre.next = start.next;
			   start = pre.next;
		   }else{
			   map.put(start.val, start);
			   pre = start;
			   start = start.next;
		   }
	   }  
        return begin.next;
    }
}
