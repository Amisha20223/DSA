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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next ==null || head == null)
        return null;

        ListNode s =head.next.next;
        ListNode  e=head;
        while(s!=null && s.next!=null){
            s = s.next.next;
            e = e.next;
           
        }
        
        e.next = e.next.next;
        return head;



        
    }
}