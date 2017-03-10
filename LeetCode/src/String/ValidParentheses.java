package String;

import java.util.Stack;
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
//determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class ValidParentheses {
	
	public boolean isValid(String s) {
		//运用了栈的数据结构
		Stack<Character> stack = new Stack<Character>(); 
		
		for(int i = 0 ; i < s.length() ; i++){
			//左括号进栈
			if(s.charAt(i) =='('|s.charAt(i)=='{' |s.charAt(i) == '['){
				stack.push(s.charAt(i));
			}
			//不是左括号则出栈，如空栈，则直接返回false
			else if(stack.empty()){
                return false;
    		}
			//出栈括号类型若与其对应，则向下遍历，不匹配则返回false
    		else if(s.charAt(i) == ')'){
    			if(stack.pop() != '(')  return false;
    			}
    		else if(s.charAt(i) == ']'){
    			if(stack.pop() != '[')  return false;
    			}
    		else if(s.charAt(i) == '}'){
    			if(stack.pop() != '{')  return false;
    			}
			}
		//遍历到最后如果栈非空，则返回false，否则true
		if(stack.empty()){
			return true;
		}else{
		return false;
		}
    }
}
