package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//For example, given array S = [-1, 0, 1, 2, -1, -4],
//A solution set is:
//[
//[-1, 0, 1],
//[-1, -1, 2]
//]

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
    	int temp = - 1;
    	//先对数组进行排序
    	Arrays.sort(nums);
    	//由于是三数之和，所以第一个数字循环到倒数第二个位置
    	for(int i = 0 ; i < nums.length - 2 ; i ++){
    		//这里目标数字是0，所以最小值如果大于0，则无符合条件结果
    		if(nums[i] >  0 ) break;
    		//判定跟前一个遍历的数字是否相同，故跳过
    		if(temp == -nums[i]) continue;
    		temp = - nums[i];
    		int j = i + 1,k = nums.length - 1;
    		//这样问题转化为two sum情况，运用双指针法求解
    		while(j < k){		
    			//符合条件情况
    			if(nums[j] + nums[k] == temp){
    				res.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
    				//由于需要找出所有的值，这里需要继续移动指针，但要判定重复值进行指针移动，避免输出重复答案
    				while(j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
    				while(k - 1 > j &&  nums[k] == nums[k - 1]) k--;
    				j++;k--;
    			}else if(nums[j] + nums[k] > temp)  k--;//当和大于判定值时，后面指针前移
    			else j++;//当和小于判定值时，前面指针后移
    		}	
    	}
    	return res;
    }
}
