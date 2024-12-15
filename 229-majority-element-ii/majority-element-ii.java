class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> aba = new ArrayList<>();
    HashMap<Integer,Integer> ans = new HashMap<>();
    int a = nums.length/3;
        for(int i = 0; i<nums.length;i++){
          if(ans.containsKey(nums[i])){
          ans.put(nums[i], ans.get(nums[i]) + 1);

      }
      else{
       ans.put(nums[i], 1);

      }
        }
         for (Integer key : ans.keySet()){
            if(ans.get(key) > a){
              aba.add(key);
            }
         }
         return aba;
    }
}