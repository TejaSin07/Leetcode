class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minMax = weights[0];
        int maxSum = 0;
        for(int i = 0;i< weights.length;i++){
            minMax = Math.max(minMax,weights[i]);
            maxSum += weights[i];
        }
        int left = minMax;
        int right = maxSum;
        while(left <=right ){
            int mid = (left + right)/2;
            boolean count = isPossible(weights,days,mid);

            if(count){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean isPossible(int[]weights, int days,int mid) {
        int sum = 0;
        int count = 0;
        for(int k : weights){
            sum += k;
            if(sum>mid){
                count++;
                sum = k;
            }
            else if(sum==mid){
                sum = 0;
                count++;
            }
            else {
                continue;
        }
        }
        if(sum>0) {
            count++;
        }
        return count<=days;
    }
}