package String;

import java.util.*;

public class WordLadder {
	
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	    
		//开辟两个set空间来存储begin和end
		List<String> beginSet = new ArrayList<String>();
		List<String> endSet = new ArrayList<String>();
    	
		//开辟三个变量空间来存储步长，单词长度和访问路径
    	int len = 1;
    	int strLen = beginWord.length();
    	List<String> visited = new ArrayList<String>();
    	
    	//双向寻路：一边开始初始词，一边开始结尾词
    	beginSet.add(beginWord);
    	endSet.add(endWord);
    	
    	
    	while (!beginSet.isEmpty() && !endSet.isEmpty()) {
        	//如果begin长度过大，则begin和end互换，是为了减少遍历次数提高效率
    		if (beginSet.size() > endSet.size()) {
    			List<String> set = beginSet;
    			beginSet = endSet;
    			endSet = set;
    		}
    		
    		//开辟一个临时set空间
    		List<String> temp = new ArrayList<String>();
    		//这里运用了加强循环：循环beginSet里面的word，这段循环代码体现的是BFS思想
    		for (String word : beginSet) {
    			//以chs的char数组形式保存单词，便于置换其中一个
    			char[] chs = word.toCharArray();
    			
    			//这里开始置换每一个位置的字母，用A到Z进行遍历置换
    			for (int i = 0; i < chs.length; i++) {
    				for (char c = 'a'; c <= 'z'; c++) {
    					//old用于保存被置换的初始原单词
    					char old = chs[i];
    					chs[i] = c;
    					//将置换后的新单词转换为string
    					String target = String.valueOf(chs);
    					
    					//如果另一边已保存，说明两边搭桥成功！找到路径
    					if (endSet.contains(target)) {
    						return len + 1;
    					}
    					
    					//如果找到新路径，之前没有保存过，则进行保存
    					if (!visited.contains(target) && wordList.contains(target)) {
    						temp.add(target);
    						visited.add(target);
    					}
    					//遍历完进行还原
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
