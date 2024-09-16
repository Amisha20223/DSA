class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int i =0; i<k;i++){
            sum= sum +nums[i];
        }
        int maxsum =sum;
        int s=0;
        int e =k;
        while(e<nums.length){
            sum-=nums[s];
            s++;
            sum+=nums[e];
            e++;
            maxsum = Math.max(maxsum,sum);



        }
        return (double) maxsum/k;

        
    }
}