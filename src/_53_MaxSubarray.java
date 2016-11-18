
public class _53_MaxSubarray {

	public static int maxSubArray(int[] nums){

		int sum = Integer.MIN_VALUE;
		int max_sum = sum;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				if (nums[i]> max_sum ) {
					max_sum = nums[i];
					sum = nums[i];
				} else {
					if( nums[i] + sum >= 0 )
						sum += nums[i];
					else
						sum = nums[i];
				}

			} else {
				if(sum >= 0)
					sum += nums[i];
				else 
					sum = nums[i];
				if (sum > max_sum) {
					max_sum = sum;
				}
				
			}
		}
		
		max_sum = (sum < max_sum)?max_sum:sum;
		
		return max_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] n = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		//System.out.println(maxSubArray(n));
		System.out.println("2"+3);
	}

}
