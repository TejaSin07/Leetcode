class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        int dup = x;
        int rev = 0;
        while(dup > 0){
            rev = rev*10 + dup%10;
            dup = dup / 10;   
        }
        return rev == x;
    }
}