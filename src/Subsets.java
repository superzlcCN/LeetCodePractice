import java.util.ArrayList;
import java.util.List;


public class Subsets {
	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums==null || nums.length == 0) {
			return result;
		}
		List<Integer> item = new ArrayList<Integer>();
		operate(nums.length,0,result,item,nums);
		return result;
	}
	
	private void operate(int len,int begin,List<List<Integer>> result,List<Integer> item,int[] nums){
		if(item.size() == len){
			result.add(item);
			return;
		}
	
			for (int i = begin; i < nums.length; i++) {
				item.add(nums[begin]);
				operate(len,begin+1,result,item,nums);
				item.remove(item.size()-1);
			}
			
		}
	}

