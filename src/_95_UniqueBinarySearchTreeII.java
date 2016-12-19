import java.util.ArrayList;
import java.util.List;

public class _95_UniqueBinarySearchTreeII {
	public List<TreeNode> generateTrees(int n){
		
		List<TreeNode> generatedTrees = new ArrayList<>();
		if(n <= 0){
			return generatedTrees;
		}
		int[] nums = new int[n];
		for(int i = 0; i< n;i++){
			nums[i] = i+1;
		}
		generatedTrees = _genTrees(nums,0,n-1);
		return generatedTrees;
	}
	
	private List<TreeNode> _genTrees(int[] nums,int left_limit,int right_limit){
		if (left_limit > right_limit) {
			return null;
		}
		
		List<TreeNode> result = new ArrayList<>();
		
		if (left_limit == right_limit) {
			result.add(new TreeNode(nums[left_limit]));
			return result;
		}
		
		for(int i = left_limit; i <= right_limit; i++){
			
			List<TreeNode> left_root_nodes = _genTrees(nums,left_limit,i-1);
			List<TreeNode> right_root_nodes = _genTrees(nums,i+1,right_limit);
			
			int count = 0;
			
			if(left_root_nodes!= null)
			for (TreeNode l_treeNode : left_root_nodes) {
				TreeNode t = new TreeNode(nums[i]);
				t.left = l_treeNode;
				result.add(t);
				count++;
			}
			
			if (right_root_nodes!=null) {
				if(left_root_nodes!=null) {
					for (TreeNode r_node : right_root_nodes) {
						for(int k = 0; k<count;k++){
							result.get(result.size()-1-k).right = r_node;
						}
					}
				}else{
					for (TreeNode r_node : right_root_nodes) {
						TreeNode t = new TreeNode(nums[i]);
						t.right = r_node;
						result.add(t);
					}
					
				}
			}
			
		
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		_95_UniqueBinarySearchTreeII t = new _95_UniqueBinarySearchTreeII();
		t.generateTrees(3);
	}
}
