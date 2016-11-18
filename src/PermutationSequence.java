
public class PermutationSequence {
	public static String getPermation(int n ,int k){
		String result = "";
		int pCount = 1;
		int[] nums = new int[n];
		for(int i = 0; i < n;i++){
			nums[i] = (i+1);
			pCount*=(i+1);
		}
		
		k--;
		
		for(int i = 0;i < n;i++){
			pCount = pCount/(n-i);
			int selected = k / pCount;
			k = k % pCount;
			
			result += (nums[selected]);
			for(int j = selected; j < n-i-1;j++){
				nums[j] = nums[j+1]; 
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(getPermation(3,1));
	}
}
