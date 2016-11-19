import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]

 */
public class _90_SubsetsII {
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	
		 if(nums == null || nums.length ==0){
			 throw new IllegalArgumentException();
		 }
		 
		 List<List<Integer>> result = new ArrayList<>();
		 result.add(new ArrayList<>());
		 Arrays.sort(nums); 
		 getSets(result, new ArrayList<Integer>(), nums, 0);
		 
		 return result;
	 }
	 
	 private void getSets(List<List<Integer>> result,List<Integer> list,int[] nums,int cur_index){
		if (cur_index >= nums.length) {
			return;
		}
		
		for (int i = cur_index; i < nums.length; i++) {
			list.add(nums[i]);
			result.add(new ArrayList<Integer>(list));
			getSets(result, list, nums, i+1);
			list.remove(list.size()-1);
			
			while(i+1 < nums.length && nums[i+1]==nums[i])  { i++; }
				
		}
		
	 }
}
