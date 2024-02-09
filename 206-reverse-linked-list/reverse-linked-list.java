/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // public ListNode reverseList(ListNode head) {

    // ListNode prev = null;
    // ListNode curr = head;

    // while(head!=null){

    // curr = head.next;
    // head.next = prev;
    // prev = head;
    // head = curr;

    // }
    // return prev;
    // }

    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) {
        	return head;
        }
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;

    }

    
    

}