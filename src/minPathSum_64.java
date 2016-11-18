
public class minPathSum_64 {
	public int minPathSum(int[][] grid){
		int m = grid.length;
		int n = grid[0].length;
		
		int[][] res = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++){
				if(i == 0){
					if(j != 0){
						res[i][j]= res[i][j-1] + grid[i][j]; 
					}else{
						res[i][j] = grid[i][j];
					}
				}else{
					if (j == 0) {
						if (i != 0) {
							res[i][j] = res[i-1][j] + grid[i][j]; 
						}else{
							res[i][j] = grid[i][j]; 
						}
					}else{
						res[i][j] = Math.min(res[i-1][j],res[i][j-1]) + grid[i][j]; 
					}
				}
			} // end of for lv2
			
		} // end of for lv1
		return res[m-1][n-1];
	}
}
