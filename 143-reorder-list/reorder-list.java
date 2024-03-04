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
    public void reorderList(ListNode head) {

        ListNode slow = head;
		ListNode fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode list2 = slow.next;
		slow.next = null;
		//printLinkedList(head);
		//printLinkedList(list2);
		merge(head, list2);
        
    }


    public ListNode merge(ListNode list1, ListNode list2) {
		
		if(list2 == null) {
			return list1;
		}
		
		list1 = merge(list1, list2.next);
		// System.out.println("value2 is "+list2.val);
		// System.out.println("value1 is "+list1.val);
		list2.next = list1.next;
		list1.next = list2;
		// printLinkedList(list1);
		list1 = list2.next;
		// System.out.println("list1 is at "+list1.val);
		return list1;
		
		
	}
	
}