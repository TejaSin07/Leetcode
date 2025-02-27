class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int c = x;
        int y = 0;
        while(x > 0){
            int a = x%10;
            x= x/10;
            y = y*10 +a;
        }
        return c==y;
    }
}