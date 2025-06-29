class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        helper(0,temp,ans,s);
        return ans;
    }

    public static void helper(int ind,List<String>temp,List<List<String>> ans,String s){
        if(ind == s.length()){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        for(int i = ind;i< s.length();i++){
            if(isPali(ind,i,s)){
                temp.add(s.substring(ind,i+1));
                helper(i+1,temp,ans,s);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static boolean isPali(int start,int end,String s){
        while(start <= end){
            if(s.charAt(start)!= s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
}