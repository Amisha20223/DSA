class Solution {
    public int findKthLargest(int[] nums, int k) {
      
        PriorityQueue<Integer> kNumbersMinHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

          
        for (inti = 0; i < k; i++) {
            kNumbersMinHeap.add(nums[i]);
        }

       
        for (inti = k; i < nums.length; i++) {
            
            if (nums[i] > kNumbersMinHeap.peek()) {
               
                kNumbersMinHeap.poll();
             
                kNumbersMinHeap.add(nums[i]);
            }
        }
   return kNumbersMinHeap.peek();
    }
}