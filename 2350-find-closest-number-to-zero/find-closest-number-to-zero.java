import java.util.Arrays;
class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int closest =nums[0];
        for(int i =0;i<nums.length;i++){
          if(Math.abs(nums[i])<Math.abs(closest)){
            closest=nums[i];
          }
          else if(Math.abs(nums[i])==Math.abs(closest) && nums[i]>closest){
           closest = nums[i];
          }
            
          }
          
        
         return closest;

        
        
    }
     
   
}