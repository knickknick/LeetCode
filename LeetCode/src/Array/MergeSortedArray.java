package Array;

//Given two sorted integer arrays nums1 and nums2,
//merge nums2 into nums1 as one sorted array.
//Note:
//You may assume that nums1 has enough space 
//(size that is greater or equal to m + n) to hold additional elements from nums2. 
//The number of elements initialized in nums1 and nums2 are m and n respectively.

public class MergeSortedArray {
	
	/*
	 * 注意这里要求不能开辟新的空间，而是把nums2整合到nums1里面
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {	
		int count = m + n - 1 ;	
		//当二者里面都还有值得情况
		while(m > 0 && n > 0){
			//从数组两数组之和-1的位置开始比较，可以保证预留足够空间
			if(nums1[m-1] <= nums2[n-1]){
				nums1 [count--] =  nums2[--n];
			}else{
				nums1 [count--] =  nums1[--m];
			}
		}		
		//当其中一个数组没有值以后的情况
		if( m == 0) {
			while(count >= 0){
				nums1 [count--] =  nums2[--n];
			}
		}
		if( n == 0) {
			while(count >= 0){
				nums1 [count--] = nums1[--m];
			}
		}
   }
}
