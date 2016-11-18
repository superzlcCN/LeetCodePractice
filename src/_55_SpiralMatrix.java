import java.util.ArrayList;
import java.util.List;


public class _55_SpiralMatrix {

		public List<Integer> sprialOrder(int[][] matrix){
			
			List<Integer> result = new ArrayList<Integer>();
			if(matrix == null ||  matrix.length == 0 || matrix[0].length == 0)
				return result;
			
			int m = matrix[0].length;
			int n = matrix.length;
			boolean[][] exist = new boolean[n][m];
			func(0,1,matrix,exist,result);
			return result;
		}
		
		/**
		 * 
		 * @param start 遍历其实坐标
		 * @param type 大于0 代表为横向遍历，小于0为竖向
		 * @param matrix
		 * @param len	值根据type而定，如果是横向传则为
		 * @param exist
		 * @param result
		 */
		private void func(int start, int type, int[][] matrix, boolean[][] exist,List<Integer> result){
			int _index = 0;
			int _index1 = 0;
			if (type > 0) { //横向遍历
	
				for (int i = 0; i < matrix[0].length; i++) {
					if ( !exist[start][i] ) {
						result.add(matrix[start][i]);
	
						exist[start][i] = true;
						_index = i;
						if(result.size() == matrix[0].length * matrix.length){
							return;
						}
					}
				}
				
				for( int i = 0; i < matrix.length;i++){
					if (!exist[i][_index]) {
						result.add(matrix[i][_index]);
						exist[i][_index] = true;
						_index1 = i;
						if(result.size() == matrix[0].length * matrix.length){
							return;
						}
					}
				}
				
				
			} else {
				
				for( int i = (matrix[0].length-1); i >=0; i--){
					if (!exist[start][i]) {
						result.add(matrix[start][i]);
						exist[start][i] = true;
						_index = i;
						if(result.size() == matrix[0].length * matrix.length){
							return;
						}
					}
				}
				
				for (int i = (matrix.length - 1); i >= 0; i--) {
					if (!exist[i][_index]) {
						result.add(matrix[i][_index]);
						exist[i][_index] = true;
						_index1 = i;
						if(result.size() == matrix[0].length * matrix.length){
							return;
						}
					}
				}
			}
			
			func( _index1, type*(-1), matrix, exist, result);
	}
	
	public static void main(String[] args) {
		

		int[][] matrix = {};
		
		_55_SpiralMatrix sm = new _55_SpiralMatrix();
		List<Integer> result = sm.sprialOrder(matrix);
		if (result!=null)
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}
		
	}

}
