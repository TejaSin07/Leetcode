class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList();
        List<String> lst = new ArrayList();

        helper(0,lst,ans,s);
        return ans;
    }


    private void helper(int ind,List<String> lst, List<List<String>> ans,String s){

        if(ind == s.length()){
            ans.add(new ArrayList(lst));
            return ;
        }


        for(int i = ind;i<s.length();i++){
            if(isPali(ind,i,s)){
                lst.add(s.substring(ind,i+1));
                helper(i+1,lst,ans,s);
                lst.remove(lst.size()-1);
            }
        }
    }


    private boolean isPali(int start,int end,String s){

        while(start<end){
            if(s.charAt(start)!= s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}