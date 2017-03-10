package String;

import java.util.*;

public class WordLadder {
	
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	    
		//��������set�ռ����洢begin��end
		List<String> beginSet = new ArrayList<String>();
		List<String> endSet = new ArrayList<String>();
    	
		//�������������ռ����洢���������ʳ��Ⱥͷ���·��
    	int len = 1;
    	int strLen = beginWord.length();
    	List<String> visited = new ArrayList<String>();
    	
    	//˫��Ѱ·��һ�߿�ʼ��ʼ�ʣ�һ�߿�ʼ��β��
    	beginSet.add(beginWord);
    	endSet.add(endWord);
    	
    	
    	while (!beginSet.isEmpty() && !endSet.isEmpty()) {
        	//���begin���ȹ�����begin��end��������Ϊ�˼��ٱ����������Ч��
    		if (beginSet.size() > endSet.size()) {
    			List<String> set = beginSet;
    			beginSet = endSet;
    			endSet = set;
    		}
    		
    		//����һ����ʱset�ռ�
    		List<String> temp = new ArrayList<String>();
    		//���������˼�ǿѭ����ѭ��beginSet�����word�����ѭ���������ֵ���BFS˼��
    		for (String word : beginSet) {
    			//��chs��char������ʽ���浥�ʣ������û�����һ��
    			char[] chs = word.toCharArray();
    			
    			//���￪ʼ�û�ÿһ��λ�õ���ĸ����A��Z���б����û�
    			for (int i = 0; i < chs.length; i++) {
    				for (char c = 'a'; c <= 'z'; c++) {
    					//old���ڱ��汻�û��ĳ�ʼԭ����
    					char old = chs[i];
    					chs[i] = c;
    					//���û�����µ���ת��Ϊstring
    					String target = String.valueOf(chs);
    					
    					//�����һ���ѱ��棬˵�����ߴ��ųɹ����ҵ�·��
    					if (endSet.contains(target)) {
    						return len + 1;
    					}
    					
    					//����ҵ���·����֮ǰû�б����������б���
    					if (!visited.contains(target) && wordList.contains(target)) {
    						temp.add(target);
    						visited.add(target);
    					}
    					//��������л�ԭ
    					chs[i] = old;
    				}
    			}
    		}

    		beginSet = temp;
    		len++;
    	}
    	return 0;
    }
	
	public static void main(String[] args) {
		 
		List<Integer> a = new ArrayList<>();
      		a.add(2);
      		a.add(3);
      		a.add(4);
      		a.add(5);
      		a.add(6);
      		a.remove(Integer.valueOf(4));
      		for(int i = 0; i < a.size(); i++){
      			System.out.println(a.get(i));
      		}
                      
	}

}
