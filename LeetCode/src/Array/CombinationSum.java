package Array;

import java.util.ArrayList;
import java.util.List;

//Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
//
//The same repeated number may be chosen from C unlimited number of times.
//
//Note:
//All numbers (including target) will be positive integers.
//The solution set must not contain duplicate combinations.
//For example, given candidate set [2, 3, 6, 7] and target 7, 
//A solution set is: 
//[
//  [7],
//  [2, 2, 3]
//]
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	List<Integer> temp = new ArrayList<Integer>();
        backtrack(list,temp,candidates,target,0);
        return list;
    }
    /*
     * �ݹ�˼�룬������������ֱ��ǣ�
     * list�������
     * temp��Ŀǰ������ﱣ���Ԫ�أ��ѱ�����·����
     * candidates����Ҫ����������
     * target��Ŀǰ��Ŀ������
     */
    
    public void backtrack(List<List<Integer>> list,List<Integer> temp,int[] candidates,int target,int start){
    	if(target < 0 ) return;
    	//target������˵����·����������
		if(target == 0) list.add(new ArrayList(temp));
		//����������ϵľ���ѭ���㷨�����ݷ�
    	for(int i = start ; i < candidates.length ; i++){
    		temp.add(candidates[i]);
            backtrack(list,temp,candidates,target - candidates[i],i);
            temp.remove(temp.size() - 1);
    	}
    }
}
