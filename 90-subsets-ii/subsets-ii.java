class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> hash = new HashSet<>(); 
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();

        backTrack(0,nums,hash,temp);
        List<List<Integer>> result = new ArrayList<>(hash);
        return result;
    }


    private void backTrack(int index,int[] nums,Set<List<Integer>> hash,List<Integer> temp ){
        if(index == nums.length){
            hash.add(new ArrayList<>(temp));
            return ;
        }

        temp.add(nums[index]);
        
        backTrack(index+1,nums,hash,temp);

        temp.remove(temp.size()-1);

        
        backTrack(index+1,nums,hash,temp);
    }
}