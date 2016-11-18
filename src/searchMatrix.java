
public class searchMatrix {
	public boolean searchMatrix(int[][] matrix,int target){
		int m = matrix.length;
		int n = (matrix[0].length-1);
		
		while(n>=0){
			if (matrix[0][n] > target) {
				n--;
			}else if(matrix[0][n]< target){
				int col = n;
				int i = 0;
				while(i < m){
					if(matrix[i][col] < target){
						i++;
					}else if (matrix[i][col] > target){
						break;
					}else {
						return true;
					}
				}
				n--;
			}else{
				return true;
			}
		}
		
		return false;
	}
	
	
}
