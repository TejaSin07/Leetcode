class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        backTrack(0,s,res,temp);
        return res;
    }

    public void backTrack(int ind,String s,List<List<String>> res,List<String> temp ){
        if(ind == s.length()){
            res.add(new ArrayList<>(temp));
            return ;
        }

    for(int i = ind;i<s.length();i++){
        if(isPali(ind,i,s)){
            temp.add(s.substring(ind, i+1));
            backTrack(i+1,s,res,temp);
            temp.remove(temp.size()-1);
        }
    }
    }

    public boolean isPali(int start,int end,String s){
        while(end>start){
        if(s.charAt(start++) != s.charAt(end--)){
            return false;
        }
    }
    return true;
    }
}