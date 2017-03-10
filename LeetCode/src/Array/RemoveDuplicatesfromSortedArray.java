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
		 //������Ŀ����Ҫ���������в��������ǽ����ز�ͬԪ�ص���ĿҲ��ͨ�����ԣ�����û�а�numβ����Ԫ�ؽ��д�����������Ӱ����Խ����
		 for(int i = 1; i < nums.length; i++){
			 if(nums[i] != val) {
				 nums[count++] = nums[i] ;
				 val = nums[i];
			 }
		 }
		 return count;
    }
}