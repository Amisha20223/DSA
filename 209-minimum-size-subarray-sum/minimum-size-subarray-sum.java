class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int chotu = Integer.MAX_VALUE;
        int sum = 0;
        int shru = 0;
        int high = 0;

        while (high < nums.length) {
            sum += nums[high];
            high++;

            while (sum >= target) {
                int windowkasize = high - shru;
                chotu = Math.min(chotu, windowkasize);
                sum -= nums[shru];
                shru++;
            }
        }

        return chotu == Integer.MAX_VALUE ? 0 : chotu;
    }
}
