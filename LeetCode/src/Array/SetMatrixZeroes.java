package Array;

public class SetMatrixZeroes {

	
    public void setZeroes(int[][] matrix) {
    	
    	//���������ռ��¼��һ�е�һ���Ƿ����ı�ʶ
        boolean row = false;
    	boolean com = false;
    	//�жϵ�һ�е�һ���Ƿ����ı�ʶ
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
    	//�Ծ�����б��������ݱ��������ǹ����ʶ
    	for(int i = 0 ; i < matrix.length; i ++){
    		for(int j = 0 ; j < matrix[i].length; j ++){
    			if(matrix[i][j] == 0){
    				matrix[0][j] = 0;
    				matrix[i][0] = 0;
    			}
    		}
    	}
    	//�Ծ������һ�����һ����������ݹ���
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
    	//���Ծ����һ�����һ�й���
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
