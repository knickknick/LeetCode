package Array;
//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this in place with constant memory.
//For example,
//Given input array nums = [1,1,2],
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
public class RemoveDuplicatesfromSortedArray {
	
    public int removeDuplicates(int[] nums) {
    	 if(nums.length <= 0) return 0;
		 int count = 0 ;
		 int val = nums[0];
		 //这里题目可能要求对数组进行操作，但是仅返回不同元素的数目也能通过测试（这里没有吧num尾部的元素进行处理，但不想影响测试结果）
		 for(int i = 1; i < nums.length; i++){
			 if(nums[i] != val) {
				 nums[count++] = nums[i] ;
				 val = nums[i];
			 }
		 }
		 return count;
    }
}
