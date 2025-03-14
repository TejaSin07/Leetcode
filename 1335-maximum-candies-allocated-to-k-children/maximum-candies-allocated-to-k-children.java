class Solution {
    public int maximumCandies(int[] arr, long k) {
        long sum = 0;
        for(long temp: arr ){
            sum += temp;
        }
        if(sum == k)return 1;

        long left = 1;
        long right = sum/k;
        int result = 0;
        

        while(left <= right){
            long count = 0;
            long mid = (left + right)/2;
            
            for(long ele : arr){
                count += ele/mid;
            }

            if(count >= k){
                left = mid+1;
                result =(int) mid;
            }
            else{
                right = mid-1;
            }
        }
        return result;
    }
}