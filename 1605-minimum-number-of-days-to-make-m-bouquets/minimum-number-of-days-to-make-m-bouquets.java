class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (((long)m * k) > bloomDay.length) return -1;

        int max = bloomDay[0];
        int min = bloomDay[0];
        
        
//         if (((long)m * k) > n) return -1;
// instead of if(m*k >n) return -1;

// as the range for m is given 10^6 and for k it is 
// 10^5 so when multiplied it causes integer overflow .

        for(int i : bloomDay){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        int left = min;
        int right = max;

        while(left <= right){
            int mid = left + (right - left) / 2;
            boolean possible = calReq(bloomDay,mid,m,k);
            if(possible){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    private static boolean calReq(int[]bloomDay,int mid,int m,int k){
        int boq = 0;
        int adj =0;
        for(int a : bloomDay){
            if(a <= mid){
                adj++;
            }
            else{
                boq += adj/k;
                adj =0;
            }
        }
        boq += adj/k;
        if( boq >= m){
           return true; 
        }
        return false;
    }
}