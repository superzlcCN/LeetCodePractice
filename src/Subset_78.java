import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Subset_78 {
	public List<List<Integer>> subsets(int[] nums){
		if(nums == null){
			return null;
		}
		List<List<Integer>> result = func(0, nums, nums.length);
		return result;
	}
	
	private List<List<Integer>> func(int start,int[] nums, int length){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(start == length - 1){
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(nums[start]);
			list.add(temp);
		}else{
			List<List<Integer>> list2 = func(start+1, nums, length);
			for (int i = 0; i < list2.size(); i++) {
				List<Integer> temp = list2.get(i);
				
				list.add(temp);
				temp.add(nums[start]);
				Arrays.sort(temp.toArray());
				list.add(temp);
			}
		}
		return list;
	}
}
