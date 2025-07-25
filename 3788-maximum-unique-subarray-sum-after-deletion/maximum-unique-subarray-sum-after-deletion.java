class Solution {
    public int maxSum(int[] nums) {
       int maxSum = 0;
       boolean posFound = false;
       int maxEle = nums[0];
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0;i< nums.length;i++){
            if(nums[i] > 0){
                set.add(nums[i]);
            }
            maxEle = Math.max(nums[i],maxEle);
       }
       for(int ele : set ){
            posFound = true;
            maxSum += ele;
       }
       if(posFound)return maxSum;
       return maxEle; 
    }
}