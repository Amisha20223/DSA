class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0,r=letters.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(letters[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return letters[l%letters.length];
    }
}