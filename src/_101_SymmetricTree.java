
import java.util.LinkedList;

public class _101_SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		
		 LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		 
		 if (root == null) {
			return true;
		 }
		 list.add(root.left);
		 list.add(root.right);
		 while(list.size() > 1){
			TreeNode left = list.poll();
			TreeNode right = list.poll();
			 
			if(left==null && right == null)
				 continue;
			if (left == null ^ right == null) {
				return false;
			}
			
			if (left.val != right.val) {
				return false;
			}
			
			list.add(left.left);
			list.add(right.right);
			list.add(left.right);
			list.add(right.left);
			
			
		 }
		
		 return true;
       
    }
	
	
}
