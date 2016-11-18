
public class ClimbingStairs_70 {
	public int climbStairs(int n){
		int[] method = new int[n];
		for (int i = 0; i < method.length; i++) {
			if(i==0){
				method[i] = 1; 
			}else{
				if (i == 1) {
					method[i] = 2;
				}
				else{
					method[i] = method[i-1]+method[i-2];
				}
			}
		}
		return method[n-1];
	}
}
