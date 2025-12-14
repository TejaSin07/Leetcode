class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(goal.length() != s.length())return false;
        s = s+s;

        for(int i = 0;i<s.length();i++){

            int size = 0;
            int ind = i;

            while(ind < s.length() && size < goal.length() && s.charAt(ind) == goal.charAt(size)){
                size++;
                ind++;
            }

            if(size == goal.length())return true;
        }
        return false;
    }
}