class Solution {
    public int minDays(int[] days, int m, int k) {
        
        int left = 1;
        int right = Integer.MIN_VALUE;
        
        for(int i : days){
            right = Math.max(right,i);
        }
        
        int maxLtd = right;
        int len = days.length;
        if(len < m*k)return -1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(isPos(mid,days,m,k)){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left>maxLtd?-1:left;
    }

    private boolean isPos(int mid,int [] days,int m,int n){
        
        int flowers = 0;
        for(int i : days){

            if(i <= mid){
                flowers++;
                if(flowers == n ){
                    m--;
                    flowers =0;
                }
            }
            else{
                flowers = 0;
            }
            if(m <= 0)return true;
        }
        return false;
    }
}