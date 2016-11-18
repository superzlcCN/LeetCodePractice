
public class _226_InvertBinaryTree {
	public class TreeNode{
		int val;
		public TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			this.val = x;
		}
	}
	
	public TreeNode invertTree(TreeNode root){
		
		if(root == null){
			return null;
		}
		
		//if( root.left == null || root.right == null){
			
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			
		//	return root;
		//}
		
		/*if ( 
			(root.left.left==null&&root.left.right==null)
			&& 
			(root.right.left==null && root.right.right==null)
		) {
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			return root;
		}*/
		
		invertTree(root.left);
		invertTree(root.right);
		return root;
		//return invertTree(root);
	}
}
