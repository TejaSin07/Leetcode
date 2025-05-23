class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int count = 0;
        for(int i = 0;i< s.length();i++){
            if(s.charAt(i) == '('){
                stk.push('(');
            }
            else if(!stk.empty()){
                stk.pop();
            }
            else{
                count++;
            }
        }
        return count+stk.size();
    }

    //tc : O(n)
    //sc : O(1)
}