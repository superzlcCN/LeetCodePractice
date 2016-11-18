
public class SpiralMatrix2_59 {


	public int[][] GenerateMatrix(int n){
		if(n==0)
			return new int[0][0];
		
		int[][] result = new int[n][n];
		boolean[][] isGen = new boolean[n][n];
		Generate(result,0,n,1,1,isGen);
		return result;
	}
	
	private void Generate(int[][] result,int start, int n,int direct,int value,boolean[][] isGen ){
		if(value == (n*n)+1)
			return;
		
		int _index = 0;
		int _index1 = 0;
		if( direct == 1 ){
			for (int i = 0; i < n; i++) {
				if( !isGen[start][i] ) {
					result[start][i] = value++;
					_index = i;
					isGen[start][i] = true;
				}
			}
			
			for(int i = 0; i < n; i++){
				if( !isGen[i][_index] ) {
					result[i][_index] = value++;
					_index1 = i;
					isGen[i][_index] = true;
				}
			}
		}else{
			for (int i = n-1; i >= 0; i--) {
				if(!isGen[start][i]){
					result[start][i] = value++;
					_index = i;
					isGen[start][i] = true;
				}
			}
			
			for (int i = n-1; i >= 0; i--) {
				if(!isGen[i][_index]){
					isGen[i][_index] = true;
					result[i][_index] = value++;
					_index1 = i;
				}
			}
		}
		
		Generate(result,_index1,n,direct*(-1),value,isGen);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrix2_59  sm = new SpiralMatrix2_59();
		int[][] result = sm.GenerateMatrix(0);
		
		for(int i = 0; i < 3; i++){
			
			for(int j = 0; j< 3;j++)
				System.out.println(result[i][j]);
		}
	}

}
