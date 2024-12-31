class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = maxval(piles);
        while(left<=right){
            int mid = (left + right)/2;
            int totalH = totHource(piles,mid);
            if(totalH <= h ){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    private static int maxval(int[] v){
        int max = v[0];
        for(int i :  v){
            max = Math.max(max,i);
        }
        return max;
    }

    private static int totHource(int [] arr,int k){
        int t = 0;
        for(int i :arr){
            t += Math.ceil((double)(i)/(double)(k));
        }
        return t;
    }

}