class Solution {
    public int maxScore(int[] arr, int k) {
       int leftSum = 0;
       int count = k;
       for(int i = 0;i<k;i++){
        leftSum  += arr[i];
       }
       int rightSum = 0;
       int mSum = leftSum;

       int left = k-1;
       int right = arr.length-1;
       
       while(left >= 0){
            leftSum -= arr[left];
            rightSum += arr[right];
            left--;
            right--;
            mSum = Math.max(leftSum+rightSum,mSum);
       }

        return mSum;
            
    }
}