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
    public ListNode reverseKGroup(ListNode head, int k) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode temp = head;
		int count = 1;
		while(temp.next!=null) {
			temp = temp.next;
			count++;
		}
		
		count = count - (count%k);
		
		//System.out.println("count value is "+count);
		
		ListNode temp2 = head;
		ListNode current =  head;
		ListNode swap = new ListNode(-1, head);
		
		for(int i=1; i<=count; i++) {
			
			if(i%k == 0) {
				swap = current;
				current = current.next;
				continue;
			}
			
			temp2 = current.next;
			current.next = current.next.next;
			temp2.next = swap.next;
			swap.next = temp2;	
			
			if(i==k-1) {
				head = swap.next;
			}
			
		}

        return head;

    }
}