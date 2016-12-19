import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Given a binary tree, return the inorder traversal of its nodes' values.


public class _94_BinaryTreeInOrderTraversal {
	 public List<Integer> inorderTraversal(TreeNode root) {
		 List<Integer> list = new ArrayList<>();
		 Stack<TreeNode> stk = new Stack<>();
		 if(root!=null){
			 TreeNode t = root;
			 //stk.push(t);
			 while(t!=null || !stk.isEmpty()){
				 while(t!=null){
					 stk.push(t);
					 t=t.left;
				 }
				 
				 if (!stk.isEmpty()) {
					TreeNode n = stk.pop();
					list.add(n.val);
					t = n.right;
				}
			 }
		 }
		 return list;
	 }
}
