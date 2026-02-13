class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int len = nums.length;
        int [] arr = new int [len];

        for(int i = 0;i<len;i++){

            int cur = nums[i];

            arr[i] = (int)Arrays.stream(nums).filter(a -> a<cur).count(); 
        }

        return arr;
    }
}