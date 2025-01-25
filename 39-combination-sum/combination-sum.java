class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTrack(0,candidates,target,temp,result);
        return result;
    }

    private static void backTrack(int index,int[] cand,int target,List<Integer>temp, List<List<Integer>> result){
        if(index == cand.length){
            if(target == 0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        if(cand[index]<= target){
            temp.add(cand[index]);
            backTrack(index,cand,target-cand[index],temp,result);
            temp.remove(temp.size()-1);
        }
         backTrack(index+1,cand,target,temp,result);
    }
}