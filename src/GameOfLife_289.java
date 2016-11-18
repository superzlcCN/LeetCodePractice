
public class GameOfLife_289 {
	public int[][] gameOfLife(int[][] board){
		int m = board.length;
		if(m==0)
			return null;
		int n = board[0].length;
		
		int[][] tmp_board = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j] == 1){
					int num = calLiveNeighborCell(i, j, board);
					if(num < 2 || num > 3)
						tmp_board[i][j] = 0; // die
					else
						tmp_board[i][j] = 1;
				}else{
					int num = calLiveNeighborCell(i, j, board);
					if(num == 3){
						tmp_board[i][j] = 1;
					}else
						tmp_board[i][j] = 0;
				}
				
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j]=tmp_board[i][j];
			}
		}
		return board;
	}
	
	private int calLiveNeighborCell(int i,int j, int[][] board){
		int m = board.length;
		int n = board[0].length;
		
		int res = 0;
		
		if (i-1 >= 0 && i-1 < m) {
			if (j-1 >= 0 && j-1 < n) {
				if(board[i-1][j-1]==1)
					res+=1;
			}
	
			if (board[i-1][j]==1) {
				res+=1;
			}
			
			if (j+1 >= 0 && j+1 <n) {
				if (board[i-1][j+1]==1) {
					res+=1;
				}
			}
		}
		
		if(j-1 >= 0 && j-1 <n)
		{
			if(board[i][j-1]==1)
				res+=1;
		}
		
		
			
		
		if(j+1 >= 0 && j+1 < n)
		{	
			if (board[i][j+1]==1) {
				res+=1;
			}
		}
		
		if(i+1 >= 0 && i+1 < m){
			if(j-1>=0 && j-1 < n)
				if (board[i+1][j-1]==1) {
					res+=1;
				}
			if(board[i+1][j]==1)
				res+=1;
			
			if(j+1 >= 0 && j+1 < n)
				if (board[i+1][j+1]==1) {
					res+=1;
				}
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,1}};
		GameOfLife_289 g = new GameOfLife_289();
		int[][] arr1 = g.gameOfLife(arr);
		for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length;j++)
				System.out.print(arr1[i][j]);
			System.out.println();
		}
	}
}
