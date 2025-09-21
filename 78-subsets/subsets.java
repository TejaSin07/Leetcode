class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0,nums,ans,temp);
        return ans;
    }


    private static void helper(int idx,int[] nums,List<List<Integer>> ans,List<Integer> temp ){

        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        helper(idx+1,nums,ans,temp);
        temp.remove(temp.size()-1);

        helper(idx+1,nums,ans,temp);
    }
}