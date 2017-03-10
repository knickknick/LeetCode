package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	/*
	 * 此为最直接的暴力算法，其时间复杂度为O（n^2）,故不是最优算法
	 */
	public int[] twoSum1(int[] nums, int target) {
		
    	int[] fal = new int[2]; 
    	
        for(int i = 0 ; i < nums.length ; i++){

        	int t = target - nums[i];
        	
        	for(int j = i + 1 ; j < nums.length ; j++){
        		
        		if(nums[j] == t){
        			fal[0] = i ;
        			fal[1] = j ;    			
        		}
        		
        	}
        	
        }
		return  fal;

	}
	/*
	 * 此为效率最高的方法，利用map进行检索，其时间复杂度为O（n）,但在某些情况下不适用，
	 * 比如给定数组内有重复数据而要求返回所有满足条件的结果
	 */
	public int[] twoSum2(int[] nums, int target) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int[] res = new int[2];
		
		for(int i = 0 ; i < nums.length;++i){
			
			if(hm.containsKey(nums[i])){

			}else{
			hm.put(nums[i], i);
			}
		}
		
		for(int i = 0 ; i < nums.length;++i){
			
			int temp = target - nums[i];
			if(hm.containsKey(temp) && hm.get(temp) != i){
				
				res[0] = i ;
				res[1] = hm.get(temp);
				
			}
		}
		return  res;
	}
	
	/*
	 * 下面是ThreeSum的方法实现，这里考虑排序算法
	 */
	public int[] twoSum3(int[] numbers, int target) {
	    
		int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for (int i = 0; i < numbers.length; i++) {
//	        System.out.println("map中的值为:"+ map.size());
//	        System.out.println("此时i的值为:"+ i);
	    	if (map.containsKey(target - numbers[i])) {
//		        System.out.println("开始判断为真后map中的值为:"+ map.size());
//		        System.out.println("此时i的值为:"+ i);
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }else{
//		        System.out.println("开始判断为假后map中的值为:"+ map.size());
//		        System.out.println("此时i的值为:"+ i);
	        }
	    	if(map.containsKey(numbers[i])){

			}else{
				map.put(numbers[i], i);
			}
	    }
	    return result;
	}
}
