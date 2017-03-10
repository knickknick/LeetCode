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
    		//��Ŀ������򻯴��룬������Ҫ���ַ���ת��Ϊ���֣�ע���Ǵ�β�˿�ʼȡ
    		x = i < a.length() ? Character.getNumericValue(a.charAt(a.length() - 1 - i)):0;
    		y = i < b.length() ? Character.getNumericValue(b.charAt( b.length()- 1 - i)):0;
    		//�����Ƶ����ȡ��
    		sum = (x + y + remain) % 2;
    		remain = (x + y + remain) / 2;
    		//����λ�õĽ��ת��Ϊstring��������
			String temp = Integer.toString(sum);
			res.append(temp);
    	}
    	if(remain != 0)	res.append(remain);
    	//��󽫽������ת��������
        return res.reverse().toString();
    }
}
