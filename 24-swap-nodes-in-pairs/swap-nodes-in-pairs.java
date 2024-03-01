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
    public ListNode swapPairs(ListNode head) {

        ListNode tempNode = head;
        ListNode tempNode2 = head;
        ListNode tempNode3 = null;
        ListNode tempNode4 = null;
        int i=0;

        
        while(tempNode2!=null){
        	
        	//System.out.println("temp2 value now is "+tempNode2.val);

            i++;
            if(i%2==0){
                
                if(i==2){
                    head.next = tempNode2.next;
                    tempNode2.next = head;
                    head = tempNode2; 
                    tempNode2 = tempNode2.next;
                    //printLinkedList(head);
                    //System.out.println("temp1 value from if "+tempNode.val);
                    //System.out.println("temp2 value from if "+tempNode2.val);
                }
                else{
                    tempNode3 = tempNode.next;
                    tempNode4 = tempNode2.next;
                    tempNode.next = tempNode2;
                    tempNode2.next = tempNode3;
                    tempNode3.next = tempNode4;
                    tempNode = tempNode.next.next;
                    tempNode2 = tempNode2.next;
                    //printLinkedList(head);
                    //System.out.println("temp1 value from else "+tempNode.val);
                    
                }

                if(tempNode2==null) {
                	continue;
                }
                
                //System.out.println("temp2 value from else "+tempNode2.val);
//                if(i!=2) {
//                	tempNode = tempNode2.next;
//                }
            }
            tempNode2 = tempNode2.next;
        }

        return head;
        
    }
}