package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	/*
	 * ��Ϊ��ֱ�ӵı����㷨����ʱ�临�Ӷ�ΪO��n^2��,�ʲ��������㷨
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
	 * ��ΪЧ����ߵķ���������map���м�������ʱ�临�Ӷ�ΪO��n��,����ĳЩ����²����ã�
	 * ����������������ظ����ݶ�Ҫ�󷵻��������������Ľ��
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
	 * ������ThreeSum�ķ���ʵ�֣����￼�������㷨
	 */
	public int[] twoSum3(int[] numbers, int target) {
	    
		int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for (int i = 0; i < numbers.length; i++) {
//	        System.out.println("map�е�ֵΪ:"+ map.size());
//	        System.out.println("��ʱi��ֵΪ:"+ i);
	    	if (map.containsKey(target - numbers[i])) {
//		        System.out.println("��ʼ�ж�Ϊ���map�е�ֵΪ:"+ map.size());
//		        System.out.println("��ʱi��ֵΪ:"+ i);
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }else{
//		        System.out.println("��ʼ�ж�Ϊ�ٺ�map�е�ֵΪ:"+ map.size());
//		        System.out.println("��ʱi��ֵΪ:"+ i);
	        }
	    	if(map.containsKey(numbers[i])){

			}else{
				map.put(numbers[i], i);
			}
	    }
	    return result;
	}
}
