class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        Integer dp[][][] = new Integer[strs.length][m+1][n+1];
        return helper(0,strs,m,n,dp); //(0,5,5,3)
    }

    private int helper(int ind,String[] strs,int zeros ,int once,Integer[][][] dp){

        if(ind == strs.length ){
            return 0;
        }
        
        if(dp[ind][zeros][once] != null)return dp[ind][zeros][once];

        int nonTake = helper(ind+1,strs,zeros,once,dp);
        
        //calc curr zeros
        int z = calZero(strs[ind]);
        int newZeros = zeros - z;
        int newOnce = once - (strs[ind].length()-z);
        int take = 0;

        if(newZeros >= 0 && newOnce >= 0){
            take= 1+helper(ind+1,strs,newZeros,newOnce,dp);
        }

        int ans = Math.max(take,nonTake);
        
        return dp[ind][zeros][once] =ans;

    }


    private int calZero(String str){
        int count = 0;

        for(char c : str.toCharArray()){
            if(c == '0'){
                count++;
            }
        }
        return count;
    }
}