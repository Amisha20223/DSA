class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String r = "";
        int i=0,j=0;
        while( i<word1.length()|| j<word2.length()){
            if(i<word1.length()){
                r = r + word1.charAt(i);
                i++;
            }
             if(j<word2.length()){
                r = r + word2.charAt(j);
                j++;
            }
        }
        return r;

}
}