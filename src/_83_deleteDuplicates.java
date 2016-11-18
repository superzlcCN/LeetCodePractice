
public class _83_deleteDuplicates {
	public ListNode deleteDuplicates(ListNode head){
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode p = head;
		ListNode q = head.next;
		
		while(q!=null){
			if(p.val != q.val){
				p = q;
				q = q.next;
			}else{
				while(q!=null && p.val == q.val){
					q = q.next;
				}
				p.next = q;
			}
		}
		return head;
	}
}
