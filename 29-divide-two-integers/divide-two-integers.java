class Solution {
    public int divide(int up, int d) {
        
        int sign = 1;

        if((up < 0 && d > 0) || (up >0 && d <0))sign = -1;

        long upper  = Math.abs((long)up);
        long down = Math.abs((long)d);
        long ans  = 0;

        while(upper >= down){
            long count = 0;
            long val = 0 ;

            while(upper >= (down * Math.pow(2,count))){
                count++;
            }

            ans += Math.pow(2,count-1);
            upper -= (down*Math.pow(2,count-1));
        }
        ans = ans*sign;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)ans;
    }
}