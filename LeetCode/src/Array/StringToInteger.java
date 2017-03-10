package Array;

public class StringToInteger {
	
	public int myAtoi(String str) {
        if (str.isEmpty()) return 0;
        int sign = 1;        //�жϷ��ţ�ֵΪ1����-1
        int base = 0;		 //��¼ת���ķ����������
        int i = 0;           //ѭ����׼��
        int n = str.length();//��¼�ַ����ĳ���
        while (i < n && str.charAt(i) == ' ') ++i;//ȥ���ַ���ǰ��Ŀո���Ϊǰ��Ŀո�Ӱ�����ֵ��ж�
        //�ж������ţ�������ֻ������λ�����Կ���һ��ʼ�ͽ����ж�
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = (str.charAt(i++) == '+') ? 1 : -1;
        }
        //���￼���ַ����Ƿ�Ϊ�����Լ�Խ�������������û�п��ǵ���Ȼ��e���Ժ��л����Ľ�
        while (i < n &&  Character.isDigit(str.charAt(i))) {
        	//����Ĺؼ��������Integer�ı߽�λ��û�и������ת��ʧ��,��Ҫע����Ǹ�ֵҪ����ֵ�߽��һ����ֵ����+0=��ֵ������
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }
}
