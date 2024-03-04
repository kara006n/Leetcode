/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findMiddle(ListNode start) {
		
		if(start.next == null || start.next.next == null) return start;
		
		
		ListNode slow = start;
		ListNode fast = start;
		
		while(fast!=null && fast.next!=null ){

			fast = fast.next.next;
			slow = slow.next;
			
		}
			
		return slow;
	}
	public ListNode sortList(ListNode head) {
		
		
		if(head == null || head.next == null ) {
			return head;
		}
		
		ListNode mid = findMiddle(head);
		//System.out.println("mid value is "+mid.val);
		ListNode temp =  mid.next;
		mid.next = null;
		ListNode list1 = sortList(head);	
		ListNode list2 = sortList(temp);
		
		ListNode merge = merge(list1, list2);
		//printLinkedList(merge);
		return merge;	

	}
	
	
	public ListNode merge(ListNode list1, ListNode list2) {
		
		
		ListNode startNode = new ListNode(-1);
		ListNode temp = startNode;
		
		while(list1!=null && list2!=null) {
			
			if(list1.val < list2.val) {
				temp.next = list1;
				list1 = list1.next;
			}
			
			else {
				
				temp.next = list2;
				list2 = list2.next;
			}
			
			temp = temp.next;
		}
		
		temp.next = (list1 == null) ? list2: list1;
		//printLinkedList(startNode.next);
		
		return startNode.next;
		
	}
}