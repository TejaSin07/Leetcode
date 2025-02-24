class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int len = 0;
        int n = grid.length;
        int  m =grid[0].length;
        for(int i : limits){
            len += i;
        }

        int [] sol = new int [len];
        int ind = 0;
       for(int i =0;i<n;i++){
        Arrays.sort(grid[i]);
        int ltd = limits[i];
        
        for(int j = m-1;j>=0;j--){
            if(ltd<=0)break;
            sol[ind++] = grid[i][j];
            ltd--;
            if(ltd==0)break;
        }
       } 
    long sum = 0;
    Arrays.sort(sol);
    for(int i = len-1;i>=0;i--){
         if(k==0)break;
        sum += sol[i];
        k--;
       
    }
    return sum;
    }
}