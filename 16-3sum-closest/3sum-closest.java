class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int tempSum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - tempSum) < diff) {
                        ans = tempSum;
                        diff = Math.abs(target - tempSum);
                    }
                }
            }
        }
        return ans;
    }
}