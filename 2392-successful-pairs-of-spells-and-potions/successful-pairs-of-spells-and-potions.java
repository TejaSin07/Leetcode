class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int lenS = spells.length;
        int lenP = potions.length;

        int ans [] = new int[lenS];

        for(int i = 0;i<lenS;i++){
            ans[i] = helper(spells[i],potions,success);
        }

        return ans;
    }


    private static int helper(int mul,int[]arr,long target){

        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            long val = (long)arr[mid]*mul;

            if(val < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return arr.length-left;
    }
}