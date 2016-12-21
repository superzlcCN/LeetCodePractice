import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _103_BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<TreeNode> queueNode = new ArrayList<TreeNode>();
        
        if (root!=null) {
        	//list.add(Arrays.asList(root.val));
        	queueNode.add(root);
		}
        
        boolean flag = true;
        
        while(!queueNode.isEmpty()){
        	List<Integer> _list = new ArrayList<Integer>();
        	List<TreeNode> _queueNode = new ArrayList<TreeNode>();
        	
        	while(!queueNode.isEmpty()){
        		TreeNode treeNode = (queueNode.remove(0));
        		_queueNode.add(treeNode);
        	}
        	
        	_queueNode.forEach(el->{
        		if(el.left != null)
        			queueNode.add(el.left);
        		if(el.right != null)
        			queueNode.add(el.right);
        	});
        	
        	if(flag){
        		
        		while(!_queueNode.isEmpty()){
        			_list.add(_queueNode.remove(0).val);
        		}
        	}else{
        		while(!_queueNode.isEmpty()){
        			_list.add(_queueNode.remove(_queueNode.size()-1).val);
        		}
        	}
        	flag = !flag;
        	list.add(_list);
        }
        return list;
    }
}
