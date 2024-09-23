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
        if (head == null) return null;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
    
        while (even != null && even.next != null) {
            odd.next = even.next; // Move odd pointer to next odd node
            odd = odd.next;       // Move odd forward
            even.next = odd.next; // Move even pointer to next even node
            even = even.next;     // Move even forward
        }
        
        odd.next = evenHead; // Connect odd list to the head of even list
        return head;
    }
}
