class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && arr[i - 1] == arr[i]) continue;

            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && arr[j - 1] == arr[j]) continue;

                int k = j + 1;
                int l = len - 1;

                while (k < l) {
                    long sum = arr[i] + arr[j];
                    sum += arr[k] + arr[l];

                    if (sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while (k < l && arr[k - 1] == arr[k]) k++;
                        while (k < l && arr[l + 1] == arr[l]) l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return ans;
    }
}