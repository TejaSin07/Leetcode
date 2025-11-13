class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans  = new ArrayList();
        List<Integer> lst = new ArrayList<>();

        int [] num = {1,2,3,4,5,6,7,8,9};

        helper(0,num,k,n,lst,ans);
        return ans;
    }


    private void helper(int ind,int [] num,int size,int sum,List<Integer> lst,List<List<Integer>> ans){

        if(lst.size() == size){
            if(sum == 0){
                ans.add(new ArrayList(lst));
            }
            return;
        }
        if(lst.size() > size || ind >= num.length )return;

        lst.add(num[ind]);
        helper(ind+1,num,size,sum-num[ind],lst,ans);
        lst.remove(lst.size()-1);

        helper(ind+1,num,size,sum,lst,ans);
    }
}