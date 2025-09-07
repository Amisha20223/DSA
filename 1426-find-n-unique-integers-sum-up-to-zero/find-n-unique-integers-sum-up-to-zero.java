class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        int c=0;
        for(int i=1;i<=n/2; i++){
            arr[c++] = -i;
        }
        if(n%2!=0){
            arr[c++] =0;
        }
        for(int i=1; i<=n/2;i++){
            arr[c++] =i;
        }
        return arr;
    }
}