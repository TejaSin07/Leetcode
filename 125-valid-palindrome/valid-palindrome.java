class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while (start <= end){
            char curFirst = s.charAt(start);
            char curLast = s.charAt(end);

            if(!Character.isLetterOrDigit(curFirst)){
                start++;
            }
            
            else if(!Character.isLetterOrDigit(curLast)){
            end--;
            }
            else{
                if(Character.toLowerCase(curFirst) != Character.toLowerCase(curLast)){
                        return false;
                }
                start ++;
                end -- ;
            }

        } return true;

    }
}