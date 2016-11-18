
public class _136_SingleNum {
	public static int singleNumber(int[] nums){
		int result = 0;
		for (int i : nums) {
			result ^= i;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		int[] nums = {1,2,2,1};
		//System.out.println(singleNumber(nums));
		System.out.println("abc".charAt(0));
	}
}
