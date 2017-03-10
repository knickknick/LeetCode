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
    	//�ȶ������������
    	Arrays.sort(nums);
    	//����������֮�ͣ����Ե�һ������ѭ���������ڶ���λ��
    	for(int i = 0 ; i < nums.length - 2 ; i ++){
    		//����Ŀ��������0��������Сֵ�������0�����޷����������
    		if(nums[i] >  0 ) break;
    		//�ж���ǰһ�������������Ƿ���ͬ��������
    		if(temp == -nums[i]) continue;
    		temp = - nums[i];
    		int j = i + 1,k = nums.length - 1;
    		//��������ת��Ϊtwo sum���������˫ָ�뷨���
    		while(j < k){		
    			//�����������
    			if(nums[j] + nums[k] == temp){
    				res.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
    				//������Ҫ�ҳ����е�ֵ��������Ҫ�����ƶ�ָ�룬��Ҫ�ж��ظ�ֵ����ָ���ƶ�����������ظ���
    				while(j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
    				while(k - 1 > j &&  nums[k] == nums[k - 1]) k--;
    				j++;k--;
    			}else if(nums[j] + nums[k] > temp)  k--;//���ʹ����ж�ֵʱ������ָ��ǰ��
    			else j++;//����С���ж�ֵʱ��ǰ��ָ�����
    		}	
    	}
    	return res;
    }
}
