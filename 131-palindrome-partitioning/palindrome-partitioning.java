class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        helper(0,s,temp,ans);
        return ans;
    }


    private static void helper(int ind,String s, List<String> temp ,List<List<String>> ans){

        if(ind == s.length()){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = ind;i<s.length();i++){
            if(pali(ind,i,s)){
                temp.add(s.substring(ind,i+1));
                helper(i+1,s,temp,ans);
                temp.remove(temp.size()-1);
            }
        }


    }

    private static boolean pali(int start,int end,String s){
        while(start < end){
            if(s.charAt(start++) !=  s.charAt(end--))return false;
        }
        return true;
    }
}