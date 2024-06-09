import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4)
            return result;

        Arrays.sort(nums);

        int n = nums.length;

        if (4 * nums[0] > target || 4 * nums[n - 1] < target)
            return result;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) // skip duplicates
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) // skip duplicates
                    continue;

                int left = j + 1;
                int right = n - 1;

                int target2 = target - nums[i] - nums[j];

                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target2) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) // skip duplicates
                            left++;
                        while (left < right && nums[right] == nums[right - 1]) // skip duplicates
                            right--;

                        left++;
                        right--;
                    } else if (sum < target2) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}