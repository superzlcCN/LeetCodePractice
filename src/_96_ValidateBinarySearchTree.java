
public class _96_ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root){
		if (root == null) {
			return false;
		}
		
		return validate(root);
	}
	 
	private boolean validate(TreeNode node){
		if(node == null){
			return true;
		}
		
		TreeNode left_child = node.left;
		TreeNode right_child = node.right;
		
		int left_val = (left_child!=null)?left_child.val:Integer.MIN_VALUE;
		int right_val = (right_child!=null)?right_child.val:Integer.MAX_VALUE;
		
		if(left_val >= node.val || right_val <= node.val)
		{
			return false;
		}
		
		return validate(left_child) && validate(right_child);
	}
}
