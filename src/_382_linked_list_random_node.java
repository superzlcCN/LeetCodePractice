import java.util.Random;

public class _382_linked_list_random_node {
	ListNode head;
	
	public _382_linked_list_random_node(ListNode head){
		if(head!=null)
			this.head = head;
	}
	
	public int getRandom(){
		ListNode t = new ListNode(head.val);
		ListNode p = head.next;
		int count = 1;
		while(p!=null){
			int i = count;
			int num = (int)(Math.random()*(count++));
			if (num == 0) {
				t.val = p.val;
			}
			p = p.next;
		}
		return t.val;
	}
}
