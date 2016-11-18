
public class sortColors {
	public static void sortColors(int[] nums){
		int begin = 0;
		int end = nums.length-1;
		int pivot = 1;
		int n = quickSort(nums,begin,end,1);
		quickSort(nums,begin,n,0);
		quickSort(nums,n+1,end,2);
	}
	
	public static int quickSort(int[] nums,int begin, int end,int pivot){
		while(begin <= end){
			if(nums[begin] > pivot){
				int t = nums[begin];
				nums[begin] = nums[end];
				nums[end] = t;
				//swapNums(nums[begin], nums[end]);
				end--;
			}else { //if(nums[begin] < pivot){
				begin++;
			}
		}
		return end;
	}
	
	
	public static void main(String[] args){
		int[] nums = {1,0,2,0,1,2};
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
