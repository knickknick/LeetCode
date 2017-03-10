package String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
	//运用了递归调用，用left和right代替剩余左括号和右括号的个数，这种思路是解本题的关键
	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateOneByOne("", list, n, n);
        return list;
    }
	//以下为递归函数
    public void generateOneByOne(String sublist, List<String> list, int left, int right){
        if(left > right){
            return;
        }
        if(left > 0){
            generateOneByOne( sublist + "(" , list, left-1, right);
        }
        if(right > 0){
            generateOneByOne( sublist + ")" , list, left, right-1);
        }
        if(left == 0 && right == 0){
            list.add(sublist);
            return;
        }
    }
}
