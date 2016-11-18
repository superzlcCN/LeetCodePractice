
public class _237_DeleteNodeInLinkedList {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public void deleteNode(ListNode node){
		ListNode n1 = node.next;
		while(n1!=null){
			node.val = n1.val;
			node.next = n1.next;
			n1 = null;
		}
	}
}
