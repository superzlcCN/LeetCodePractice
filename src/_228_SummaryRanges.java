import java.util.ArrayList;
import java.util.List;

public class _228_SummaryRanges {
	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		if(nums.length == 0)
			return list;
		int begin = 0;
		int end = 0;
		while(begin < nums.length){
			int j = begin+1;
			while( j < nums.length ){
				if(nums[j] == nums[j-1]+1){
					j++;
				}else{
					end = j-1;
					break;
				}
			}//end of while-j
			if(j == nums.length){
				end = j-1;
			}
			if(begin!=end){
				list.add( nums[begin]+"->"+nums[end] );
			}else{
				list.add(Integer.toString(nums[begin]));
			}
			begin=j;
			end = j;
		}
		return list;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,4,6,7,8,12};
		List<String> list = summaryRanges(nums);
		for(int i = 0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
