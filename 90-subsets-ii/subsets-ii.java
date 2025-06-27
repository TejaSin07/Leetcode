class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        helper(0,len,nums,temp,lst);
        return lst;
    }

    public static void helper(int ind,int len ,int[] nums,List<Integer>temp,List<List<Integer>> lst){
        if(ind == len){
            lst.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[ind]);
        helper(ind+1,len,nums,temp,lst);
        temp.remove(temp.size()-1);

        while(ind < len-1 && nums[ind]==nums[ind+1]){
            ind++;
        }
        helper(ind+1,len,nums,temp,lst);
    }
}