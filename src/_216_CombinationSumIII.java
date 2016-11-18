import java.util.ArrayList;
import java.util.List;

public class _216_CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int len = 9;
        for(int i = 0; i < 8;i++){
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(nums[i]);
        	backtracking(res,list, i+1, len-1, k-1, n-nums[i],nums);
        	list.remove(list.size()-1);
        }
        return res;
    }
	// 3,7
	private void backtracking( List<List<Integer>> res,List<Integer> list, int begin, int end,int k,int n,int[] nums){
		if(begin >= nums.length)
			return;
		
		if(k == 0){
			if(n==0){
				res.add(list);
				//list = new ArrayList<Integer>();
			}
			return;
		}
		else{
			for(int i = begin; i <= end; i++){
				if(nums[i] <= n){
					list.add(nums[i]);
					backtracking(res,list, i+1, end, k-1, n-nums[i], nums);
					list.remove(list.size()-1);
				}else{
					break;
				}
			}
			return;
		}
	}// end of backtracking
	
	public static void main(String[] args) {
		_216_CombinationSumIII test = new  _216_CombinationSumIII();
		List<List<Integer>> res = test.combinationSum3(3, 7);
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j)+" ");
			}
			System.out.println(",");
		}
	}
}
