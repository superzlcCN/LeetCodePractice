
public class _283_moveZeros {
	public void moveZeros(int[] nums){
		
		int count = 0; // 记录0出现的次数
		
		for(int i = 0; i < nums.length; i ++){
			if(nums[i] == 0){
				count++;
			}else{
				nums[i-count] = nums[i];
			}
		}
		
		int n = (nums.length - 1);
		while(count!=0){
			nums[n--] = 0;
			count--;
		}
	}
}
