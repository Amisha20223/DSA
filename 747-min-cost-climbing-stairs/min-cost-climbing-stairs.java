class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int [] mincost = new int[n+1];
        for( int i=2;i<=n;i++){
            mincost[i] = Math.min((cost[i-1] +mincost[i-1]) , (cost[i-2]+mincost[i-2]));
        }

        return mincost[n];
    }
    
}