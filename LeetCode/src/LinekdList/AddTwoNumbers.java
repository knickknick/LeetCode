package LinekdList;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8	

		
	public class AddTwoNumbers {
		
		public class ListNode {
			int val;
			ListNode next;
			ListNode(int x) { val = x; }
		}
		
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			
			//计算进位相加，这里需要定位一个余数变量，一个进位数变量
			int carry = 0;
			int total = 0;
			int rest = 0;
			ListNode res =  new ListNode(0);
			ListNode head = res;
	       			
			//当两个指针
			while(l1 != null || l2 != null || carry !=0){
				
				//三目运算简化代码结构
				total = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
				carry = Math.floorDiv(total, 10);
				rest = total % 10;
				
				res.next =  new ListNode(rest);
				res = res.next;
				
				l1 = l1 == null ? null : l1.next ;
				l2 = l2 == null ? null : l2.next ;
			}
			return head.next;
	    }

}
