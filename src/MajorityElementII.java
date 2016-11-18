import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	public static List<Integer> majorityElement(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		int num1 = 0;
		int num2 = 1;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==num1){
				count1++;
			}else if (nums[i]==num2) {
				count2++;
			}else if(count1 == 0){
				num1 = nums[i];
				count1=1;
			}else if (count2 == 0) {
				num2 = nums[i];
				count2=1;
			}else{
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if ( nums[i] == num1) {
				count1++;
			}else if(nums[i] == num2){
				count2++;
			}
		}
		
		if(count1 > nums.length / 3)
			list.add(num1);
		if (count2 > nums.length / 3) {
			list.add(num2);
		}
		
		return list;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2};
		List<Integer> list = majorityElement(arr);
	}
}
