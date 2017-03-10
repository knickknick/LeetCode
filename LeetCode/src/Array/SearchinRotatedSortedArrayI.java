package Array;
//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//You are given a target value to search. If found in the array return its index, otherwise return -1.
//
//You may assume no duplicate exists in the array.
public class SearchinRotatedSortedArrayI {
	public int search(int[] nums, int target) {
		if(nums.length <= 0) return 0;
		int count = nums.length/2;
		int high = nums.length - 1;
		int low = 0;
		if(nums[count] > nums[nums.length - 1]){
			//左半边是完全顺序排列，利用边界判断是否在左半边
			if(nums[count] == target) return count;
			if(nums[low] == target) return 0;
			if(nums[count] > target && nums[low] < target){
				//确定数字在左半边
				high = count - 1;
				while(low <= high){
					count = (low + high)/2;
					if(nums[count] == target) return count;
					if(nums[count] > target){
						high = count - 1;
					}else{
						low = count + 1;
					}
				}
			}else{
				//确定数字在右半边,此时由于该半区不是连续单调，故和一般二分有区别
				low = count +  1;
				if(nums[count] < target){
					//target在count到转换前最大值之间
					while(low <= high){
						count = (low + high)/2;
						if(nums[count] == target) return count;
						if(nums[count] > target || nums[count] < nums[nums.length - 1]){
							high = count - 1;
						}else{
							low = count + 1;
						}
					}
				}
				if(nums[low] > target){
					//target在最大值之间到另外一边的中间
					while(low <= high){
						count = (low + high)/2;
						if(nums[count] == target) return count;
						if(nums[count] > target){
							high = count - 1;
						}else{
							low = count + 1;
						}
					}
				}
			}
		}else{
			//右半边是完全顺序排列，利用边界判断是否在右半边
			if(nums[count] == target) return count;
			if(nums[high] == target) return high;
			if(nums[count] < target && nums[high] > target){
				//确定数字在右半边
				low = count +  1;
				while(low <= high){
					count = (low + high)/2;
					if(nums[count] == target) return count;
					if(nums[count] > target){
						high = count - 1;
					}else{
						low = count + 1;
					}
				}
			}else{
				//确定数字在左半边
				
			}
		}
		
	    return -1;   
    }
}
