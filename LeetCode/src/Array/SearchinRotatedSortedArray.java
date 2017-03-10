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
	 * 由于数组是排序树组随机进行扭转后产生的，所以这里运用了名义中点和实际中点两个概念
	 * 名义中点：数组中的中点
	 * 实际中点：按照原始数组（即排序数组）进行二分查找找到的中点，也是数组中的中点值
	 */
	public int search(int[] nums, int target) {
		if(nums.length <= 0 ) return -1;
		int n = nums.length;
		int high = n - 1;
		int low = 0;
		//先找出最小值即扭转点的位置，记为rot
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
			//mid是名义中点
			int mid = (low + high)/2 ;
			//remid是实际中点，计算方法为名义中点加扭转点除以数组长度取余
			int remid = (mid + rot) % n ;
			//以实际中点为标准进行二分查找，进行循环
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
