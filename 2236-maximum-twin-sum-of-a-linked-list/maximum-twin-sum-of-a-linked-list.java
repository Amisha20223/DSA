class Solution {
    public int pairSum(ListNode head) {
   
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        
   
        int start = 0;
        int end = values.size() - 1;
        int maxSum = 0;
        
        while (start < end) {
            int twinSum = values.get(start) + values.get(end);
            maxSum = Math.max(maxSum, twinSum);
            start++;
            end--;
        }
        
        return maxSum;
    }
}
