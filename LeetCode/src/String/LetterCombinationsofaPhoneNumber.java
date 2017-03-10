package String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Given a digit string, return all possible letter combinations that the number could represent.
//
//A mapping of digit to letters (just like on the telephone buttons) is given below.
//
//
//
//Input:Digit string "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
    	LinkedList<String> res= new LinkedList<>();
    	if(digits.length() <= 0 ) return res;
    	res.add("");
    	char[] ch = digits.toCharArray();
    	String temp ="";
		for(int i = 0 ; i < ch.length ; i++){
			//�ҵ���i��λ�õ��ַ�ת��Ϊ����
			int x =Character.getNumericValue(ch[i]);
			//ע������ж�������true˵����ʱres�ڱ�ͷԪ�صĳ��ȵ���i
			//����˵i = 3,���ͷ����Ϊ3����ch[i]�Ǵ�����ĸ��ַ����ʸպ���Ҫ�������
			while(res.peek().length() == i){
				String t = res.poll();
				//�ڶ�λ������������������
				for(char ch1 : helper(ch[i]).toCharArray()){
					res.add(t+ch1);
				}
			}
		}
        return res;
    }
    
    public String helper(char c){
    	switch(c){
    		case '2' : 	return "abc";
    		case '3' :	return "def";
    		case '4' :	return "ghi";
    		case '5' :	return "jkl";
    		case '6' :	return "mno";
    		case '7' :	return "pqrs";
    		case '8' :	return "tuv";
    		case '9' :	return "wxyz";		
    	}
    	return "";
    }
}
