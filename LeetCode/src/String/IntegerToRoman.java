package String;

public class IntegerToRoman {
	
	 public String intToRoman(int num) {
	        
		//由于罗马数字与字母之间的对应是固定有限的，创建两个数组分别储存二者的元素
	    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuffer res = new StringBuffer();
		    for (int i = 0; i < values.length; i++) {
		    	//每次拿出不小于num的values的最大值进行比对，用num-values[i]代替num，同时将对应的罗马字母加到字符串上
		    	while(values[i] <= num){
		    		res.append(strs[i]);
		    		num  -=  values[i];
		    	}
		    }	 
		 return res.toString();
	    }
}
