
public class RotateList_61 {
	public ListNode rotateRight(ListNode head, int k){
		if(head == null || head.next == null || k == 0){
			return head;
		}
		
		
		ListNode l1 = head;
		ListNode temp = head;
		int len = 0;
		
		while(temp!=null){
			temp = temp.next;
			len ++;
		}
		
		k = k % len;
		
		while(k > 0 && l1.next!=null){
			l1 = l1.next;
			k--;
		}
		
		if(l1.next == null && k > 0){
			return head;
		}
		
		ListNode l2 = head;
		
		while(l1.next!=null){
			l2 = l2.next;
			l1 = l1.next;
		}
		l1.next = head;
		head = l2.next;
		l2.next = null;
		
		return head;
	}
}
