class Solution {
    public int maxDepth(String s) {
        int Maxdep = 0;
        int curdep = 0;
        for(char c: s.toCharArray()){
            if (c =='('){
                curdep++;
                Maxdep = Math.max(Maxdep,curdep);
            }
            else if(c == ')'){
                curdep--;
            }
        }
        return Maxdep;
    }
}