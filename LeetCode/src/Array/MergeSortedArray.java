package Array;

//Given two sorted integer arrays nums1 and nums2,
//merge nums2 into nums1 as one sorted array.
//Note:
//You may assume that nums1 has enough space 
//(size that is greater or equal to m + n) to hold additional elements from nums2. 
//The number of elements initialized in nums1 and nums2 are m and n respectively.

public class MergeSortedArray {
	
	/*
	 * ע������Ҫ���ܿ����µĿռ䣬���ǰ�nums2���ϵ�nums1����
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {	
		int count = m + n - 1 ;	
		//���������涼����ֵ�����
		while(m > 0 && n > 0){
			//������������֮��-1��λ�ÿ�ʼ�Ƚϣ����Ա�֤Ԥ���㹻�ռ�
			if(nums1[m-1] <= nums2[n-1]){
				nums1 [count--] =  nums2[--n];
			}else{
				nums1 [count--] =  nums1[--m];
			}
		}		
		//������һ������û��ֵ�Ժ�����
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
