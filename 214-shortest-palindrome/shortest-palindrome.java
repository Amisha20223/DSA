class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        StringBuilder rev = new StringBuilder(s).reverse();
        
     
        StringBuilder sb = new StringBuilder(s + "#" + rev.toString());
        
       
        for (int i = 0; i < n; i++) {
            if (s.substring(0, n - i).equals(rev.substring(i))) {
                return rev.substring(0, i) + s;
            }
        }
        return rev.toString() + s;  
    }
}
