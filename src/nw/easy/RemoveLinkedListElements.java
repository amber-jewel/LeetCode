package nw.easy;

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ListNode head = [1, 2, 3, 6, 7, 8, 6];
	//	int val = 6;
	//	ListNode temp = removeElements(head, val);
	//	System.out.println(temp);
	}

	public static ListNode removeElements(ListNode head, int val) {
		ListNode current = head; // first link 
		ListNode previous = null; // to indicate curent's previous link
		while (current != null) { // until null
			if (current.val == val) { // check val to remove link
				if (previous == null) { // if remove element is first
					head = head.next; // head --> head.next
				} else {
					previous.next = current.next; // previous.next ----> current(delete link) ---> current.next
				}
			} else {
				previous = current; // mark previous
			}
			current = current.next; // go next link
		}
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;
	public ListNode() {
		// TODO Auto-generated constructor stub
	}
	
	public ListNode(int val) {
		this.val = val;
	}
	
	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
