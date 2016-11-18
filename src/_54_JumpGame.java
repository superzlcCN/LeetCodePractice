
public class _54_JumpGame {


	public boolean canJump(int[] nums) {
		boolean result = false;
		
		if (nums == null || nums.length == 0 ) {
			return false;
		}
			
		int maxLength = nums[0];
		
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			
			if((nums[i] == 0) && i < (n-1)){
				if(maxLength > 1){
					maxLength--;
					continue;
				}
				else if(maxLength <=1){
					return false;
				}
			}
			
			maxLength--;
			
			if( nums[i] > maxLength ){
				maxLength = nums[i];
			}
			
			if(i + maxLength >= (n-1)){
				return true;
			}
			//maxLength--;
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,1,2,2,0,1,1};
		_54_JumpGame jg = new _54_JumpGame();
		System.out.println(jg.canJump(a));
	}

}
