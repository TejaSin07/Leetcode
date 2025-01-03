class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0];

        for(int z : nums){
            
            max= Math.max(max,z);

        }

        int left = 1;
        int right = max;

        while(left <= right){
            int mid = left + (right -left)/2;
            boolean possible = calPoss(nums,threshold,mid);
            if(possible){
                right = mid- 1;
            }
            else{
                left = mid +1;
            }
        }
        return left;

    }

    private static boolean calPoss(int [] nums,int threshold,int mid){
        int result = 0;
        for(int i : nums){
            result += (int) Math.ceil((double)i/mid);
        }
        if(result<= threshold){
            return true;
        }
        else{
            return false;
        }
    }
}