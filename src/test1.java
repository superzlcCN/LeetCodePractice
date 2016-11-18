import java.util.Scanner;

public class test1 {
	
	
	public int fun(int n, int[] nums){
		int[] min = {n};
		jump(nums, 0, 0, min);
		return min[0];
	}
	
	private void jump(int[] nums,int start,int step,int min[]){
		if(start < nums.length && nums[start]==0)
			return;
		else if(nums[start]+start >= nums.length){
			step+=1;
			if(step < min[0])
				min[0] =step;
			return;
		}else{
			for (int i = nums[start]; i > 0; i--) {
				step++;
				
				jump(nums, start+i, step,min);
				step--;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=scanner.nextInt();
		}
		
		
		
		
	}
}
