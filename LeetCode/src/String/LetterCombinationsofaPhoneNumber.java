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
			//找到第i个位置的字符转换为数字
			int x =Character.getNumericValue(ch[i]);
			//注意这个判断条件，true说明此时res内表头元素的长度等于i
			//比如说i = 3,则表头长度为3，而ch[i]是代表第四个字符，故刚好需要遍历添加
			while(res.peek().length() == i){
				String t = res.poll();
				//在定位到的数组里面遍历添加
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
