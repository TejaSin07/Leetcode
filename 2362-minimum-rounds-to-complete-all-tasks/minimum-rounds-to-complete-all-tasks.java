class Solution {
    public int minimumRounds(int[] tasks) {
        int len = tasks.length;
        int dp[] = new int [len];
        Arrays.sort(tasks);
        Arrays.fill(dp,Integer.MAX_VALUE);
        int x = helper(0,tasks,dp);
        if(x >= Integer.MAX_VALUE-500)return -1;
        return x;
    }


    private static int helper(int idx,int [] tasks,int[] dp){

        if(idx >= tasks.length)return 0;

        if(dp[idx] != Integer.MAX_VALUE)return dp[idx];
        int first = Integer.MAX_VALUE-500;  
        int second = Integer.MAX_VALUE-500;


        if(idx+1 < tasks.length && tasks[idx] == tasks[idx+1]){
            first = helper(idx+2,tasks,dp);
        }
        if(idx+2 < tasks.length && tasks[idx] == tasks[idx+2]){
            second = helper(idx+3,tasks,dp);
        }
        

       
        return dp[idx] = 1+ Math.min(first,second);  
    }
}