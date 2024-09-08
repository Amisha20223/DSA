class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int sum =0;
        int [] arr = new int[58];
        for(char ch:jewels.toCharArray()){
            arr[ch-'A']=1;
        }
        for(char ch:stones.toCharArray()){
            sum+= arr[ch-'A'];
        }
        return sum;
        
    }
}