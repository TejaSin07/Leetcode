class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        Stack<Character> stk = new Stack<>();
        
        for(int i = 0;i< s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                stk.push(s.charAt(i));
                continue;
            }
            if(stk.isEmpty())return false;
            if(map.get(s.charAt(i)) == stk.pop())continue;
            return false;

        }
        if(!stk.isEmpty())return false;
        return true;

    }
}