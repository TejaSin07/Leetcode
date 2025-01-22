class Solution {
private List<String> k = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        char [] sol = new char[n*2];

        sol[0] = '(';
        int totalLength = n*2;
        int currLength = 1;
        int openBrace = n;
        int countCurr = 1;
        helper(sol,totalLength,currLength,openBrace,countCurr);
        return k;
    }

   
    private void helper(char[] sol, int tl, int cL, int ob, int cc) {
        if (tl == cL) {
            String a = new String(sol);
            k.add(a);
            return;
        }

        if (cc < ob) {
            sol[cL] = '(';
            helper(sol, tl, cL + 1, ob, cc + 1);
        }

        if ((cL - cc) < cc && (cL - cc) < ob) {
            sol[cL] = ')';
            helper(sol, tl, cL + 1, ob, cc);
        }
    }
}