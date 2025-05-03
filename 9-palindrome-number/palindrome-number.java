class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x != 0 && x%10 == 0)) return false;
        // If a number ends with a 0, then its reverse would start with 0, which is not allowed in normal number format (no leading zeros).

        int rev = 0;
        while(x>rev){
            rev = rev *10 + x%10;
            x = x/10;
        }
        if(x==rev || x == rev/10)return true;
        return false;
    }
}