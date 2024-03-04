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
    public ListNode rotateRight(ListNode head, int k) {
        	
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode temp = head;
		int count = 1;
		while(temp.next!=null) {
			count++;
			temp = temp.next;
		}
		
        //handle best case
        if(count == k){
            return head;
        }

		temp.next = head;
		ListNode temp2 = temp;

        k = k%count;//initially i havent done this but when i realized that when k is smaller 
        //than length of list then it is working fine but in case where k is larger than 
        //count then error comes as count-k becomes negative.

		
		for(int i = count-k; i>0; i--) {
			
			temp2 = temp2.next;
		}

		temp = temp2.next;
		temp2.next = null;
		
		return temp;	

	}
}