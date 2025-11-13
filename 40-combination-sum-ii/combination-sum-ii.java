class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,ans,temp);
        return ans;
    }


    private void helper(int ind,int [] arr,int target,List<List<Integer>> ans, List<Integer>temp){
        if(ind == arr.length){
            if(target == 0 ){
                ans.add(new ArrayList(temp));
            }
            return ;
        }

        if(arr[ind] <= target ){
            temp.add(arr[ind]);
            helper(ind+1,arr,target-arr[ind],ans,temp);
            temp.remove(temp.size()-1);
        }
        while(ind < arr.length-1 && arr[ind] == arr[ind+1]){
            ind++;
        }

        helper(ind+1,arr,target,ans,temp);
    }
}