class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>> hash = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        backTrack(0,candidates,target,temp,hash);
        List<List<Integer>> arrayList = new ArrayList<>(hash);

        return arrayList;
    }
   private static void backTrack(int index,int[] cand,int target,List<Integer>temp, HashSet<List<Integer>> hash){
    if(index == cand.length){
        if(target==0){
            // Collections.sort(temp);
            hash.add(new ArrayList<>(temp));
        }
        return;
    }

 if(cand[index]<= target){
            temp.add(cand[index]);
            backTrack(index+1,cand,target-cand[index],temp,hash);
            temp.remove(temp.size()-1);
             while(index < cand.length-1  && cand[index] == cand[index+1]   ){
                index++;
            }
        }

    backTrack(index+1,cand,target,temp,hash);
   }
}