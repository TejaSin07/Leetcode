class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();

        backTrack(0,nums,result,temp);
        
        return result;
    }


    private void backTrack(int index,int[] nums,List<List<Integer>> hash,List<Integer> temp ){
        if(index == nums.length){
            hash.add(new ArrayList<>(temp));
            return ;
        }

        temp.add(nums[index]);
        
        backTrack(index+1,nums,hash,temp);

        temp.remove(temp.size()-1);

        while(index < nums.length-1 && nums[index]==nums[index+1]){
            index++;
        }

        
        backTrack(index+1,nums,hash,temp);
    }
}