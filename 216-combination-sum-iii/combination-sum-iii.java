class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] base = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backTrack(0, k, n,result,temp,base);
        return result;
    }

      public void backTrack(int index,int k,int target,List<List<Integer>> result,List<Integer> temp,int [] nums){
        if(temp.size() == k){
            if(target == 0){
                result.add(new ArrayList(temp));
            }
            return;
        }
        if(index >= 9){
            return;
        }
        
            temp.add(nums[index]);
            
            backTrack(index+1, k, target-nums[index],result,temp,nums);

            temp.remove(temp.size()-1);
      
       backTrack(index+1, k, target,result,temp,nums);
      }
}