
public class _101_SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		
        if ( root == null || 
        	(root.left == null && root.right!= null) || 
        	(root.left!=null && root.right == null) ||
        	(root.left.val != root.right.val)) {
			return false;
		}
        if ((root.left == null && root.right == null) || (root.left.val == root.right.val)) {
			return true;
		}
        return twoNodeCompare(root.left.left, root.right.right) && twoNodeCompare(root.left.right, root.right.left);
       
    }
	
	private boolean twoNodeCompare(TreeNode node1, TreeNode node2){
		if (node1 == null && node2 == null) {
			return true;
		}
		if ((node1 == null && node2 != null) || 
			(node1 != null && node2 == null) ||
			(node1.val != node2.val)) {
			return false;
		}
		
		return twoNodeCompare(node1.left, node2.right) && twoNodeCompare(node1.left, node2.right);
	}
}
