
public class setMatrixZeros {
	public void setZeros(int[][] matrix){
		boolean setFirstRowZero = false;
		boolean setFirstColZero = false;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0){
					
					if (i == 0) {
						setFirstRowZero = true;
					}
					if (j == 0) {
						setFirstColZero = true;
					}
					matrix[i][0] = 0;
					matrix[0][j] = 0; 
				}
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		if (setFirstColZero) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
		
		if (setFirstRowZero) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
 			}
		}
	}

}
