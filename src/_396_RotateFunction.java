
public class _396_RotateFunction {
	 public int maxRotateFunction(int[] A) {
		 int n = A.length;
		 int sum = 0,allSum = 0;
		 
		 for (int i = 0; i < n; i++) {
			 sum += A[i];
			 allSum += i*A[i];
		 }
		 int max = allSum;
		 for(int i = n-1; i >= 1; i--){
			 allSum += (sum - n*A[i]);
			 max = (max < allSum)?allSum:max;
		 }
		 return max;
	    
	 }
	 
	public static void main(String[] args) {
		System.out.println();
	}
}
