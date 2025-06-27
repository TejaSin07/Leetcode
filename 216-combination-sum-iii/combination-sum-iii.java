class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int len = 9;
        helper(1,len,temp,lst,k,n);
        return lst;
    }

    public static void helper(int ind,int len,List<Integer> temp,List<List<Integer>>lst,int k,int target){
        if(temp.size() >= k ){
            if(target == 0 && temp.size() == k){
                lst.add(new ArrayList<>(temp));
            }
            return;
        }

        if(ind <= target && ind <= len){
            temp.add(ind);
            helper(ind+1,len,temp,lst,k,target -ind);
            temp.remove(temp.size()-1);
            helper(ind+1,len,temp,lst,k,target);

        }
    }
}