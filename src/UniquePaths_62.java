
public class UniquePaths_62 {

	public int uniquePaths(int m,int n){
		int[][] matrix = new int[m][n];
		int[][] res = new int[m][n];
		
		//res[0][0] = 1;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if ( i == 0) {
					res[i][j] = 1;
				}else{
					if (j == 0){
						res[i][j] = 1;
					}else {
						res[i][j] = res[i][j-1] + res[i-1][j];
					}
				}
				
			} // end of for lv1
		} // end of for lv2
	
		return res[m-1][n-1];
	} 
}
