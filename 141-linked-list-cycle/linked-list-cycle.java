/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // public boolean hasCycle(ListNode head) {
        
	// 	Set<ListNode> table = new HashSet<>();
		
	// 	while(head!=null) {
			
	// 		if(table.contains(head)) return true;
	// 		table.add(head);
	// 		head = head.next;
			
	// 	}
		
	// 	return false;	
    // }
    public boolean hasCycle(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}