package String;
//Implement strStr().
//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
    	for(int i = 0 ;;i++){
    		for(int j = 0 ; ;j++){
    			//ע���ж�����������ʹ������
    			//˵���Ѿ��������ˣ���������
    			if(j == needle.length()) return i;
    			//˵��ʣ�µĳ����Ѿ����������������ˣ���ʱ�϶��Ҳ������������Ľ��
    			if(i + j == haystack.length()) return -1;
    			//��λ�ò��������������½���
    			if(needle.charAt(j)!= haystack.charAt(i + j)) break;
    		}
    	}
    }
}
