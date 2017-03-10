package String;

public class IntegerToRoman {
	
	 public String intToRoman(int num) {
	        
		//����������������ĸ֮��Ķ�Ӧ�ǹ̶����޵ģ�������������ֱ𴢴���ߵ�Ԫ��
	    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuffer res = new StringBuffer();
		    for (int i = 0; i < values.length; i++) {
		    	//ÿ���ó���С��num��values�����ֵ���бȶԣ���num-values[i]����num��ͬʱ����Ӧ��������ĸ�ӵ��ַ�����
		    	while(values[i] <= num){
		    		res.append(strs[i]);
		    		num  -=  values[i];
		    	}
		    }	 
		 return res.toString();
	    }
}
