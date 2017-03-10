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
			//��������ȫ˳�����У����ñ߽��ж��Ƿ�������
			if(nums[count] == target) return count;
			if(nums[low] == target) return 0;
			if(nums[count] > target && nums[low] < target){
				//ȷ������������
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
				//ȷ���������Ұ��,��ʱ���ڸð������������������ʺ�һ�����������
				low = count +  1;
				if(nums[count] < target){
					//target��count��ת��ǰ���ֵ֮��
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
					//target�����ֵ֮�䵽����һ�ߵ��м�
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
			//�Ұ������ȫ˳�����У����ñ߽��ж��Ƿ����Ұ��
			if(nums[count] == target) return count;
			if(nums[high] == target) return high;
			if(nums[count] < target && nums[high] > target){
				//ȷ���������Ұ��
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
				//ȷ������������
				
			}
		}
		
	    return -1;   
    }
}
