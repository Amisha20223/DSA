class Solution {
    public int countSymmetricIntegers(int low, int high) {

        int count = 0;

        for (int i = low; i <= high; i++) {
            String num = String.valueOf(i);
            int len = num.length();

            if (len % 2 != 0) continue;

            int half = len / 2;
            int sum1 = 0, sum2 = 0;

            for (int j = 0; j < half; j++) {
                sum1 += num.charAt(j) - '0';
            }

            for (int j = half; j < len; j++) {
                sum2 += num.charAt(j) - '0';
            }

            if (sum1 == sum2) {
                count++;
            }
        }

        return count;
    }


        
    }
