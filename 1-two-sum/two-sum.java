class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int[] a = new int[nums.length];
//         for(i = 0;i<nums.length;i++){
//             a[i] = nums[i];
//         }

//         for(i = 0;i <  nums.length;i++){
//             if(a[nums[i]-k]  )
//
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
         }

         for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && (map.get(target-nums[i])!= i)){
                return new int []{i,map.get(target-nums[i])};
            }
         }
         return new int[]{};
    }
}