class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length-1;
        int left = 0;
        int right = n;

        while(left <= right){
            int  mid = (left+right)/2;
            int missing = arr[mid] -(mid +1);
            if(missing >= k){
                right = mid-1;
            }
            else {
                left = left + 1;
            }
        }
        return k+right+1;
        }
}