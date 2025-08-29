class Solution {
    public boolean isMatch(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();

        Boolean dp [][] = new Boolean[len2][len1];

        return helper(0,0,p,s,dp);
    }

    private static boolean helper(int idx1,int idx2,String pattern,String str,Boolean [][]dp ){
        
        if(idx2== str.length() && idx1 ==pattern.length() )return true;  
       
        if(idx1 == pattern.length() && idx2< str.length()){
            return false;
        }
        

        if(idx2== str.length() && idx1< pattern.length()){
            while(idx1<pattern.length()){
                if(pattern.charAt(idx1) != '*')return false;
                idx1++;
            }
            return  true;
        }
        

        if(dp[idx1][idx2] != null)return dp[idx1][idx2];
        
        if(pattern.charAt(idx1) ==  str.charAt(idx2) || pattern.charAt(idx1) =='?'){
            return dp[idx1][idx2]=helper(idx1+1,idx2+1,pattern,str,dp);
        }

        if(pattern.charAt(idx1) =='*'){
            return dp[idx1][idx2]=(helper(idx1,idx2+1,pattern,str,dp) || helper(idx1+1,idx2,pattern,str,dp));
        }
        return dp[idx1][idx2]=false;
    } 
}