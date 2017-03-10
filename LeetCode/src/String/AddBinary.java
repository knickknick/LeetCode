package String;
//Given two binary strings, return their sum (also a binary string).
//
//For example,
//a = "11"
//b = "1"
//Return "100".
public class AddBinary {
    public String addBinary(String a, String b) {
    	if(a.length() <= 0 ) return b;
    	if(b.length() <= 0 ) return a;
    	StringBuilder res = new StringBuilder();
    	int n = Math.max(a.length(), b.length());
    	int remain = 0;
    	int x = 0;
    	int y = 0;
    	int sum = 0;
    	for(int i = 0 ; i < n || remain != 0; i++){
    		//三目运算符简化代码，另外需要把字符串转化为数字，注意是从尾端开始取
    		x = i < a.length() ? Character.getNumericValue(a.charAt(a.length() - 1 - i)):0;
    		y = i < b.length() ? Character.getNumericValue(b.charAt( b.length()- 1 - i)):0;
    		//二进制的求和取余
    		sum = (x + y + remain) % 2;
    		remain = (x + y + remain) / 2;
    		//将本位置的结果转化为string存入结果集
			String temp = Integer.toString(sum);
			res.append(temp);
    	}
    	if(remain != 0)	res.append(remain);
    	//最后将结果集翻转过来返回
        return res.reverse().toString();
    }
}
