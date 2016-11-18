
public class _63_uniquePathsWthObstacle {
	public int uniquePathsWithObstacle(int[][] obstacleGrid){
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		
		int[][] res = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for ( int j = 0; j < n; j++){
				if(obstacleGrid[i][j] != 1){
					if(i == 0){
						if(j != 0)
							res[i][j] = res[i][j-1];
						else
							res[i][j] = 1; 
					}else{
						if(j == 0){
							res[i][j] = res[i-1][j];
						}else{
							res[i][j] = res[i-1][j] + res[i][j-1]; 
						}
					}
				}else{
					res[i][j] = 0;
				}// end of if
				
			} // end of for lv2
		} // end of for lv1
		
		return res[m-1][n-1];
	}
}
