
public class JumpGame2 {
	
	public int jump22(int[] nums,int start,int steps,int maxSteps){
		if((steps > maxSteps)){
			return steps;
		}
		if(start >= nums.length-1){
			return steps;
			//return (++steps);
		}
		
		if(nums[start] == 0){
			if(start < nums.length-1)
				return Integer.MAX_VALUE;
		}

		int j = nums[start];
		int result = Integer.MAX_VALUE;
		
		for(int i = 1; i <= j; i++){
			int _steps = steps;
			int p = jump22(nums,start+i,++_steps,result);
			if(result > p)
				result = p;
		}
		
		return result;
	}
	
	public int jump(int[] nums){
		return jump22(nums,0,0,0);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
		JumpGame2 jg = new JumpGame2();
		System.out.println(jg.jump(nums));
	}

}
