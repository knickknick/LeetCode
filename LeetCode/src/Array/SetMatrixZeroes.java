package Array;

public class SetMatrixZeroes {

	
    public void setZeroes(int[][] matrix) {
    	
    	//开辟两个空间记录第一行第一列是否归零的标识
        boolean row = false;
    	boolean com = false;
    	//判断第一行第一列是否归零的标识
    	if(matrix[0][0] == 0){
    		com = true;
    		row = true;
    	}else{
	    	for(int i = 0 ; i < matrix.length ; i ++){
	    		if(matrix[i][0] == 0){
	    			com = true;
	    			break;
	        	}
	    	}
	    	for(int i = 0 ; i < matrix[0].length ; i ++){
	    		if(matrix[0][i] == 0) {
	    			row = true;
	    			break;
	    		}
	    	}
    	}
    	//对矩阵进行遍历，根据遍历结果标记归零标识
    	for(int i = 0 ; i < matrix.length; i ++){
    		for(int j = 0 ; j < matrix[i].length; j ++){
    			if(matrix[i][j] == 0){
    				matrix[0][j] = 0;
    				matrix[i][0] = 0;
    			}
    		}
    	}
    	//对矩阵除第一行与第一列以外的数据归零
    	for(int i = 1 ; matrix.length > 1 && i < matrix.length ; i ++){
    		if(matrix[i][0] == 0){
    			for(int j = 0 ; j < matrix[i].length ; j ++){
    				matrix[i][j] = 0 ;
    			}
    		}
    	}
    	
    	for(int i = 1 ; matrix[0].length > 1 && i < matrix[0].length; i ++){
    		if(matrix[0][i] == 0){
    			for(int j = 0 ; j < matrix.length ; j ++){
    				matrix[j][i] = 0 ;
    			}
    		}
    	}
    	//最后对矩阵第一行与第一列归零
    	if(com){
    		for(int j = 0 ; j < matrix.length ; j ++){
				matrix[j][0] = 0 ;
			}
    	}
    	
    	if(row){
    		for(int j = 0 ; j < matrix[0].length ; j ++){
				matrix[0][j] = 0 ;
			}
    	}
    }

	
	public static void main(String[] args) {
		
		int[][] matrix = new int [2][1];
		matrix[0][0] = 1;
		matrix[1][0] = 0;		
		SetMatrixZeroes s = new SetMatrixZeroes();
		s.setZeroes(matrix);
		for(int i = 0 ; i < matrix.length; i ++){
		System.out.println(matrix[i][0]);
		}
	}

}
