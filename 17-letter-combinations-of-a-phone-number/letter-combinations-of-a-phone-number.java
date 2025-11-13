class Solution {
    public List<String> letterCombinations(String digits) {
        
        String [] strs = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();

        helper(0,digits,strs,ans,"");
        return ans;
    }


    private void helper(int ind ,String digits,String[] strs,List<String> ans,String s){
        if(ind == digits.length()){
            ans.add(s);
            return;
        }

        int curInd = digits.charAt(ind) - '0';

        for(int i = 0;i<strs[curInd].length();i++){
            String k = s+strs[curInd].charAt(i);
            helper(ind+1,digits,strs,ans,k);
        }
    }
}