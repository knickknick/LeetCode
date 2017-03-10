package Array;

public class StringToInteger {
	
	public int myAtoi(String str) {
        if (str.isEmpty()) return 0;
        int sign = 1;        //判断符号，值为1或者-1
        int base = 0;		 //记录转化的符号外的数字
        int i = 0;           //循环基准数
        int n = str.length();//记录字符串的长度
        while (i < n && str.charAt(i) == ' ') ++i;//去掉字符串前面的空格，因为前面的空格不影响数字的判断
        //判断正负号，正负号只能在首位，所以可以一开始就进行判断
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = (str.charAt(i++) == '+') ? 1 : -1;
        }
        //这里考虑字符串是否为数字以及越界的情况，但这个没有考虑到自然数e，以后有机会会改进
        while (i < n &&  Character.isDigit(str.charAt(i))) {
        	//本题的关键，如果对Integer的边界位数没有概念则会转换失败,需要注意的是负值要比正值边界加一（正值个数+0=负值个数）
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }
}
