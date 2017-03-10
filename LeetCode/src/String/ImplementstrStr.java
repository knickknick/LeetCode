package String;
//Implement strStr().
//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
    	for(int i = 0 ;;i++){
    		for(int j = 0 ; ;j++){
    			//注意判断条件尽可能使代码简洁
    			//说明已经遍历完了，符合条件
    			if(j == needle.length()) return i;
    			//说明剩下的长度已经不够符合条件的了，此时肯定找不到符合条件的结果
    			if(i + j == haystack.length()) return -1;
    			//该位置不符合条件，向下进行
    			if(needle.charAt(j)!= haystack.charAt(i + j)) break;
    		}
    	}
    }
}
