class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        int count = 32;
        while(count != 0){

            int x = (n & 1);
            n = n>>1;
            ans = (ans<<1) | x;  
            count--;
        }
        
        return ans;
    }
}