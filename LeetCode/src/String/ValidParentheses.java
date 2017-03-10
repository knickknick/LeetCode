package String;

import java.util.Stack;
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
//determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class ValidParentheses {
	
	public boolean isValid(String s) {
		//������ջ�����ݽṹ
		Stack<Character> stack = new Stack<Character>(); 
		
		for(int i = 0 ; i < s.length() ; i++){
			//�����Ž�ջ
			if(s.charAt(i) =='('|s.charAt(i)=='{' |s.charAt(i) == '['){
				stack.push(s.charAt(i));
			}
			//�������������ջ�����ջ����ֱ�ӷ���false
			else if(stack.empty()){
                return false;
    		}
			//��ջ���������������Ӧ�������±�������ƥ���򷵻�false
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
		//������������ջ�ǿգ��򷵻�false������true
		if(stack.empty()){
			return true;
		}else{
		return false;
		}
    }
}
