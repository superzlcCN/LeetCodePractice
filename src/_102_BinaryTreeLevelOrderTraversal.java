import java.util.ArrayList;
import java.util.List;

public class _102_BinaryTreeLevelOrderTraversal {
	  public List<List<Integer>> levelOrder(TreeNode root) {
		  List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		  List<TreeNode> nodeList = new ArrayList<TreeNode>();
		  
		  if(root!=null){
			  //resultList.add(Arrays.asList(root.val));
			  nodeList.add(root);
		  }
		  
		  while(nodeList.size()>=1){
			  List<Integer> _list = new ArrayList<Integer>();
			  List<TreeNode> _list2 = new ArrayList<TreeNode>();
			  
			  while(nodeList.size()>=1){
				  TreeNode _node = nodeList.remove(0);
				  _list.add(_node.val);
				  
				  if(_node.left!=null)
					  _list2.add(_node.left);
				  
				  if (_node.right!=null) {
					  _list2.add(_node.right);
					
				}
			  }
			  nodeList.addAll(_list2);
			  resultList.add(_list);
		  }
		  
		  return resultList;
	  }
}
