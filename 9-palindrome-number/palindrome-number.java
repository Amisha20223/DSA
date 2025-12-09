class Solution {
    public boolean isPalindrome(int x) {
        int copy;
        copy=x;
        int d;
        int r=0;
        while(x>0){
            d = x%10;
            r = r*10 +d;
            x/=10;
            

        }
        return copy==r;
        


       
    }
  
}