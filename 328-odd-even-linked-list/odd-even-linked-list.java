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

    
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next ==null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode cursor = even.next;

        while(cursor != null){

            even.next = cursor.next;
            cursor.next = odd.next;
            odd.next = cursor;
            even = even.next;
            odd = odd.next;
            if(even==null) {
            	break;
            }
            cursor = even.next;
            //printLinkedList(head);
            // System.out.println("curosr is "+cursor);
            // System.out.println("even value is "+even.val);
            // System.out.println("odd value is "+odd.val);
            
        }
        
        return head;
        
      
    }
}