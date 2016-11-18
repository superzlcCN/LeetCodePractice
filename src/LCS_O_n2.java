
public class LCS_O_n2 {
	public int lis(int A[], int len){
		int[] d = new int[len];
		int len1 = 1;
		for (int i = 0; i < len; i++) {
			d[i]= 1;
			for(int j = 0; j < i;j++)
				if( A[j] < A[i] && d[j]+1 > d[i] ){
					d[i] = d[j]; 
				}
				
			if(d[i] > len1)
				len1 = d[i];
			
		}
		return len1;
	}
}
