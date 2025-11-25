class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) 
           {
                result = result + word1.charAt(i);
                i++;
            }
            if (j < word2.length()) 
           {
                result = result + word2.charAt(j);
                j++;
            }
        }

        return result;
    }
}
