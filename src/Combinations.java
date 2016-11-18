import java.util.ArrayList;
import java.util.List;


public class Combinations {
	
	public  List<List<Integer>> combine(int n,int k){

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(n<=0 || n<k){
			return result;
		}
		List<Integer> list = new ArrayList<Integer>();
	
		subCombine(1,n,k,list,result);
	
		return result;
	}
	
	private  void subCombine(int start,int end,int k,List<Integer> list,List<List<Integer>> _result){
		if (list.size()==k) {
			_result.add(new ArrayList(list));
			return;
		}
		for(int i = start;i <= end;i ++){
			list.add(i);
			subCombine(i+1,end,k,list,_result);
			list.remove(list.size()-1);
		}
	}
	
	public static void main(String[] args){
	//	combine(4,2);
	Combinations combinations = new Combinations();
			System.out.println(combinations.combine(4,2));
	}
}
