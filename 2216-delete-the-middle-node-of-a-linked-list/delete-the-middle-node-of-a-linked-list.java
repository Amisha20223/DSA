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
        if(head.next == null || head ==null)
        return null;
        
        ListNode  start =head.next.next;
        ListNode end =head;
        while(start!=null && start.next!=null){
            start =start.next.next;
            end =end.next;
        }
        end.next = end.next.next;
        return head;



        
    }
}