package Array;

//Given an array and a value, remove all instances of that value in place and return the new length.
//Do not allocate extra space for another array, 
//you must do this in place with constant memory.
//The order of elements can be changed. 
//It doesn't matter what you leave beyond the new length.
//Example:
//Given input array nums = [3,2,2,3], val = 3
//Your function should return length = 2, with the first two elements of nums being 2.

public class RemoveElement {
	
	 public int removeElement(int[] nums, int val) {
		 
		 /*
		  * 需要考虑的地方在于不能重新开辟空间，即要求空间复杂度为定值
		  * 可以在原数组上面操作，若不是要求的值，向上填充，是就跳过，返回填充的 长度
		  */
		 int count = 0 ;
		 for(int i = 0; i < nums.length; i++){
			 if(nums[i] != val) {
				 nums[count] = nums[i] ;
				 count ++;
			 }
		 }
		 return count;
	 }
}
