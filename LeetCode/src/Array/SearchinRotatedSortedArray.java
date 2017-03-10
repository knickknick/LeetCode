package Array;
//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//You are given a target value to search. If found in the array return its index, otherwise return -1.
//
//You may assume no duplicate exists in the array.
public class SearchinRotatedSortedArray {
	/*
	 * �������������������������Ťת������ģ��������������������е��ʵ���е���������
	 * �����е㣺�����е��е�
	 * ʵ���е㣺����ԭʼ���飨���������飩���ж��ֲ����ҵ����е㣬Ҳ�������е��е�ֵ
	 */
	public int search(int[] nums, int target) {
		if(nums.length <= 0 ) return -1;
		int n = nums.length;
		int high = n - 1;
		int low = 0;
		//���ҳ���Сֵ��Ťת���λ�ã���Ϊrot
		while(low < high){
			int mid = (low + high)/2;
			if(nums[mid] > nums[high]){
				low = mid + 1;
			}else{
				high = mid;
			}
		}
		int rot = low;
		low = 0;
		high = n - 1;
		
		while(low <= high){
			//mid�������е�
			int mid = (low + high)/2 ;
			//remid��ʵ���е㣬���㷽��Ϊ�����е��Ťת��������鳤��ȡ��
			int remid = (mid + rot) % n ;
			//��ʵ���е�Ϊ��׼���ж��ֲ��ң�����ѭ��
			if(nums[remid] == target) {
				return remid;
			}
			if(nums[remid] < target){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
	    return -1;   
    }
}
