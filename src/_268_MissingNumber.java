
public class _268_MissingNumber {
	public static int missingNumber(int[] nums) {
		if (nums.length == 0) {
			return -1;
		}
		
		if(nums.length==1){
		if(nums[0]==0)
			return 1;
		else
			return nums[0]-1;
		}
		int min = nums[0];
		int max = nums[0];
		int sum = 0;
		int length = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < min)
				min = nums[i];
			if(nums[i]>max)
				max = nums[i];
			sum += nums[i];
		}
		if(max == min + length-1)
			if(min!=1)
			return max+1;
			else {
				return 0;
			}
		int sum1 = (min+max)*(length+1)/2;
		int diff =sum1-sum;
		return sum1-sum;
    }
	public static void main(String[] args) {
		int[] arr = {2,3};
		System.out.println(missingNumber(arr));
	}
}
