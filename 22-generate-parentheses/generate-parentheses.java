class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        str.append('(');
        helper(1,ans,n,str,1);
        return ans;
    }

    private static void helper(int idx,List<String>ans,int n,StringBuilder s,int count){
        
        if(idx == n*2 ){   
            ans.add(new String(s));
            return;
        }

        if(count<n ){
            s.append('(');
            count++;
            helper(idx+1,ans,n,s,count);
            s.deleteCharAt(s.length() - 1);
            count--;
        }
        if(count <= n && s.length()-count < count){
            s.append(')');
            helper(idx+1,ans,n,s,count);
            s.deleteCharAt(s.length() - 1);
        }
    }
}