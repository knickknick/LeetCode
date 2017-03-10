package String;

public class RomanToInteger {
	
	 public int romanToInt(String s) {
	     
		int[] num = new int[s.length()];
		int res = 0 ;
		int j = 0;
		char[] chs = s.toCharArray();
		
		for (int i = 0; i < s.length() ; i++) {
			//���˼�룬�г���ĸ��Ӧ����
			switch (chs[i]) {
				case 'M' :
					num[i] = 1000;
					break;
				case 'D' :
					num[i] = 500;
					break;
				case 'C' :
					num[i] = 100;
					break;
				case 'L' :
					num[i] = 50;
					break;
				case 'X' :
					num[i] = 10;
					break;
				case 'V' :
					num[i] = 5;
					break;
				case 'I' :
					num[i] = 1;
					break;		
			}
		}	
		
		while (j < s.length() - 1) {
			//������Ҫ����һ���жϣ���������ĸС���ұߣ�������������ĸ�������֣�������900,400����
			if (num[j] < num[j + 1]) {
				res -= num[j]; 
				j++;
			} else {
				res += num[j];
				j++;
			}
		}
		res += num[j];
		return res;
	    }
}
