class Solution {
    public int climbStairs(int n) {
        int[] box = new int[n+1];
        Arrays.fill(box,-1);
        return dp(n,box);
    }

    public int dp(int n,int [] box){
        if(n ==1) return 1;
        if(n ==2) return 2;
        if(box[n] != -1) return box[n];

        box[n] = dp(n-1,box) + dp(n-2,box);
        return box[n];
    }
}