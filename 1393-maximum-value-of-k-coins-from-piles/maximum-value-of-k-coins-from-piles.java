class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        Integer[][] dp = new Integer[piles.size()][k+1];

        return helper(0,piles,k,dp);
    }

    private static int helper(int curPile,List<List<Integer>> piles,int k ,Integer[][] dp){
        if(curPile == piles.size() ||  k <= 0 )return 0;

        if(dp[curPile][k] != null)return dp[curPile][k];

        int res = helper(curPile+1,piles,k,dp);
        int val  =0;
        for(int idx = 0 ;idx < Math.min(piles.get(curPile).size(),k);idx++){
            val += piles.get(curPile).get(idx);
            res = Math.max(res , val+helper(curPile+1,piles,k-(idx+1),dp));
        }

        return dp[curPile][k] = res;
    }
}