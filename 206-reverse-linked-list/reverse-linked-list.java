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

    private ListNode reverse(ListNode prev, ListNode head) {

        ListNode start = null;
        if (head == null) {
            start = prev;
        } else {
            start = reverse(head, head.next);
            head.next = prev;
        }
        return start;
    }

    public ListNode reverseList(ListNode head) {

        return reverse(null, head);

    }

}