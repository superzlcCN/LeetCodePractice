
public class _66_PlusOne {
	public int[] plusOne(int[] digits){
		int n = digits.length;
		int c = 0;
		int res[] = new int[n];
		
		for(int i = n - 1;i >= 0;i --){
			int temp = 0;
			if (i == n-1) 
				temp = 1 + digits[i];
			else
				temp = c + digits[i];
			
			c = temp / 10;
			res[i] = temp % 10; 
		}
		
		
		if( c > 0){
			int[] res1 = new int[n+1];
			res1[0] = c;
			for (int i = 1; i < res1.length; i++) {
				res1[i] = res[i-1];
			}
			
			return res1;
		}
		
		return res;
	}
}
