class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ArrayList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTrack(0,candidates,target,temp,ArrayList);
       

        return ArrayList;
    }
   private static void backTrack(int index,int[] cand,int target,List<Integer>temp, List<List<Integer>> ArrayList){
    if(index == cand.length){
        if(target==0){
            // Collections.sort(temp);
            ArrayList.add(new ArrayList<>(temp));
        }
        return;
    }

 if(cand[index]<= target){
            temp.add(cand[index]);
            backTrack(index+1,cand,target-cand[index],temp,ArrayList);
            temp.remove(temp.size()-1);
             while(index < cand.length-1  && cand[index] == cand[index+1]   ){
                index++;
            }
        }

    backTrack(index+1,cand,target,temp,ArrayList);
   }
}