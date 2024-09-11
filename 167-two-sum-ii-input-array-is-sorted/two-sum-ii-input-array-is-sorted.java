class Solution {
    public int[] twoSum(int[] num, int t) {
        int arr[] = new int[2]; 

        int l = 0, h = num.length - 1;

        while (l < h) {
            int sum = num[l] + num[h];
            if (sum == t) {
                arr[0] = l+1;
                arr[1] = h+1;
                break; 
            } else if (sum > t) {
                h = h - 1;
            } else {
                l = l + 1;
            }
        }
        return arr;
    }
}

