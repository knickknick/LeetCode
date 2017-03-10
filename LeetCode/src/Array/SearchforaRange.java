package Array;
//Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        
    	int[] res = new int[2];
		res[0] = -1;
		res[1] = -1;
        for(int i = 0 ; i < nums.length; i++){
        	if(nums[i] == target){
        		//定位到第一个target开始赋值
        		res[0] = i;
        		res[1] = i;
        		//开始定位最后一个target
        		for(int j = i ; j < nums.length; j++){
        			if(nums[j] != target){
        				res[1] = j - 1;
        				break;
        			}
        			//对区间尾进新赋值
     				res[1] = j;       			
        		}
        		break;
        	}
        }
        return res;
    }
}
