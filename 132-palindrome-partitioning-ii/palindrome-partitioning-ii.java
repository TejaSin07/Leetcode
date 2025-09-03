class Solution {
    public int minCut(String s) {
        int len = s.length();
        int dp[] = new int [len];
        Arrays.fill(dp,-1);

        return helper(0,s,dp)-1;
    }


    private static int helper(int idx,String str,int []dp){

        if(idx == str.length())return 0;

        if(dp[idx] != -1)return dp[idx];
        int min = Integer.MAX_VALUE;
        for(int j = idx;j< str.length();j++){

            if(checkPali(idx,j,str)){
                min = Math.min(min,1+helper(j+1,str,dp));
            }

        }
        return  dp[idx] = min;
    }


    private static boolean checkPali(int start,int end,String s){
        while(start <= end){//brobr ahe 
            if(s.charAt(start) != s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}