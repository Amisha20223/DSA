class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int start =0;
        int end = nums.length-1;
        Arrays.sort(nums);
        while(start<end){
            if(nums[start]+ nums[end] ==k){
                start ++;
                end--;
                count++;
               
            }
            else if (nums[start] + nums[end] < k) {
              
                start++;
            } else {
               
                end--;
            }
           
        }
        return count;

        
    }
}