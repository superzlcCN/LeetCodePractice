
public class _238_ProductExceptSelf {
	public int[] productExceptSelf(int[] nums){
		int t = 1;
		int[] p = new int[nums.length];
		for(int i= 0; i < nums.length;i++){
			p[i]=t;
			t*=nums[i];
		}
		
		t=1;
		for(int i = nums.length-1;i>=0;i--){
			p[i]*=t;
			t*=nums[i];
		}		
		return p;
	}	
}
