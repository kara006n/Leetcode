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

    public int count = 0;
    public int count1 = 0;
    ListNode temp = null;
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null){
            return head;
        }
        count1++;
        removeNthFromEnd(head.next, n);
        count++;
        if(count == n){
            temp = head;
            if(n==1 && count == 1){
                head = null;
                return head;
            }

            if(count == count1){
                return head.next;
            }
        }
        if(count == n+1){
            head.next = temp.next;
        }

        return head;
        
    }
}